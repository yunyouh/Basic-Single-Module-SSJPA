package com.youmeek.ssm.aop.log;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogPointcut {
	// 在这里控制切面需要执行的位置
	@Pointcut("execution(* com.youmeek.ssm.module.*.controller.*.*(..) )")
	public void inControllerLayer() {
	}
}
