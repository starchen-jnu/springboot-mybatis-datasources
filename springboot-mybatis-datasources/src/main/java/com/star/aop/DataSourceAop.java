package com.star.aop;

/**
 * @Author: StarC
 * @Date: 2019/5/5 10:33
 * @Description:
 */
import com.star.bean.DBContextHolder;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class DataSourceAop {
    @Pointcut("!@annotation(com.star.annotation.Master) " +
            "&& (execution(* com.star.service..*.select*(..)) " +
            "|| execution(* com.star.service..*.get*(..)))")
    public void readPointcut() {
    }
    @Pointcut("@annotation(com.star.annotation.Master) " +
            "|| execution(* com.star.service..*.insert*(..)) " +
            "|| execution(* com.star.service..*.add*(..)) " +
            "|| execution(* com.star.service..*.update*(..)) " +
            "|| execution(* com.star.service..*.edit*(..)) " +
            "|| execution(* com.star.service..*.delete*(..)) " +
            "|| execution(* com.star.service..*.remove*(..))")
    public void writePointcut() {
    }
    @Before("readPointcut()")
    public void read() {
        DBContextHolder.slave();
    }
    @Before("writePointcut()")
    public void write() {
        DBContextHolder.master();
    }
    /**
     * 另一种写法：if...else... 判断哪些需要读从数据库，其余的走主数据库
     */
// @Before("execution(* com.star.service.impl.*.*(..))")
// public void before(JoinPoint jp) {
// String methodName = jp.getSignature().getName();
//
// if (StringUtils.startsWithAny(methodName, "get", "select", "find")) {
// DBContextHolder.slave();
// }else {
// DBContextHolder.master();
// }
// }
}
