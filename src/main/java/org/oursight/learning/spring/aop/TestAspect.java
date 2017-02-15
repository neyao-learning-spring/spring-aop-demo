package org.oursight.learning.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by DellPC on 2017/2/14.
 */
@Component
@Aspect
public class TestAspect {

    /**
     * 匹配某个类的所有方法的
     */
    @Around("execution(* org.oursight.learning.spring.data.controller.rest.TestResource.*(..))")
    public void allMethods(ProceedingJoinPoint joinPoint) {

        System.out.println("==== TestAspect.allMethods START ====");
        System.out.println("    TestAspect.allMethods before proceed...");
        System.out.println("    TestAspect.ping before proceed...");
        System.out.println("    joinPoint.getSignature().getClass(): " + joinPoint.getSignature().getClass());
        System.out.println("    joinPoint.getSignature().getName()" + joinPoint.getSignature().getName());
        System.out.println("    joinPoint.getSignature().getModifiers()" + joinPoint.getSignature().getModifiers());
        System.out.println("    joinPoint.getSignature().getDeclaringType()" + joinPoint.getSignature().getDeclaringType());
        System.out.println("    joinPoint.getSignature().getDeclaringTypeName()" + joinPoint.getSignature().getDeclaringTypeName());
        try {
            joinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {

        }
        System.out.println("    TestAspect.allMethods after proceed...");
        System.out.println("==== TestAspect.allMethods END ====");
        System.out.println();

    }


    /**
     * 在某个类ping2方法执行前执行
     */
    @Before("execution(* org.oursight.learning.spring.data.controller.rest.TestResource.ping2(..))")
    public void beforePing2(JoinPoint joinPoint) {

        System.out.println("==== TestAspect.beforePing2 START ====");
        System.out.println("    TestAspect.ping before proceed...");
        System.out.println("    joinPoint.getSignature().getClass(): " + joinPoint.getSignature().getClass());
        System.out.println("    joinPoint.getSignature().getName()" + joinPoint.getSignature().getName());
        System.out.println("    joinPoint.getSignature().getModifiers()" + joinPoint.getSignature().getModifiers());
        System.out.println("    joinPoint.getSignature().getDeclaringType()" + joinPoint.getSignature().getDeclaringType());
        System.out.println("    joinPoint.getSignature().getDeclaringTypeName()" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("    joinPoint.getArgs()" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("==== TestAspect.beforePing2 END ====");
        System.out.println();

    }


    /**
     * 在所有的ping2方法执行之后执行
     */
    @AfterReturning("execution(* ping2(..))")
    public void ping2AfterReturning(JoinPoint joinPoint) {

        System.out.println("==== TestAspect.ping2AfterReturning START ====");
        System.out.println("    TestAspect.ping before proceed...");
        System.out.println("    joinPoint.getSignature().getClass(): " + joinPoint.getSignature().getClass());
        System.out.println("    joinPoint.getSignature().getName()" + joinPoint.getSignature().getName());
        System.out.println("    joinPoint.getSignature().getModifiers()" + joinPoint.getSignature().getModifiers());
        System.out.println("    joinPoint.getSignature().getDeclaringType()" + joinPoint.getSignature().getDeclaringType());
        System.out.println("    joinPoint.getSignature().getDeclaringTypeName()" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("    joinPoint.getArgs()" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("==== TestAspect.ping2AfterReturning END ====");
        System.out.println();

    }

    /**
     * 仅在 org.oursight.learning.spring.data.controller.rest.TestResource 中的的ping3方法执行之后执行
     * TODO 还不能按照预期工作 neyao@20170215
     */
    @Pointcut("within(org.oursight.learning.spring.data.controller.rest.TestResource.ping3(..)")
    public void ping3AfterReturning(JoinPoint joinPoint) {

        System.out.println("==== TestAspect.ping3AfterReturning START ====");
        System.out.println("    TestAspect.ping before proceed...");
        System.out.println("    joinPoint.getSignature().getClass(): " + joinPoint.getSignature().getClass());
        System.out.println("    joinPoint.getSignature().getName()" + joinPoint.getSignature().getName());
        System.out.println("    joinPoint.getSignature().getModifiers()" + joinPoint.getSignature().getModifiers());
        System.out.println("    joinPoint.getSignature().getDeclaringType()" + joinPoint.getSignature().getDeclaringType());
        System.out.println("    joinPoint.getSignature().getDeclaringTypeName()" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("    joinPoint.getArgs()" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("==== TestAspect.ping3AfterReturning END ====");
        System.out.println();

    }

    /**
     * Around所有的ping方法，可以自行决定是否执行
     */
    @Around("execution(* ping(..))")
    public void ping(ProceedingJoinPoint joinPoint) {

        System.out.println("==== TestAspect.ping START ====");
        System.out.println("    TestAspect.ping before proceed...");
        System.out.println("    joinPoint.getSignature().getClass(): " + joinPoint.getSignature().getClass());
        System.out.println("    joinPoint.getSignature().getName()" + joinPoint.getSignature().getName());
        System.out.println("    joinPoint.getSignature().getModifiers()" + joinPoint.getSignature().getModifiers());
        System.out.println("    joinPoint.getSignature().getDeclaringType()" + joinPoint.getSignature().getDeclaringType());
        System.out.println("    joinPoint.getSignature().getDeclaringTypeName()" + joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("    joinPoint.getArgs()" + Arrays.toString(joinPoint.getArgs()));
        try {
            joinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {

        }
        System.out.println("TestAspect.ping after proceed...");
        System.out.println("==== TestAspect.ping END ====");
        System.out.println();

    }

}
