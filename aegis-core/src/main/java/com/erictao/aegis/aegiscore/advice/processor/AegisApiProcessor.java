package com.erictao.aegis.aegiscore.advice.processor;

import org.aspectj.lang.JoinPoint;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;

/**
 * @author TJX
 * @Title: AegisApiProcessor
 * @date 2018/7/2817:24
 */
public interface AegisApiProcessor<T extends Annotation> {
    /**
     * 对切入点切入前的处理
     * @param joinPoint
     * @param request
     */
    void process(JoinPoint joinPoint, HttpServletRequest request, T ann) throws Exception;
}