package com.charles.dp.proxy.handler;

import com.charles.dp.proxy.bean.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author: zhangyong
 * Date: 16/8/7
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean person;
    public NonOwnerInvocationHandler(PersonBean person){
        this.person = person;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("test");
//        try {
//            if (method.getName().startsWith("get")) {
//                return method.invoke(person,args);
//            } else if (method.getName().equalsIgnoreCase("setHotOrNotRating")) {
//                return method.invoke(person,args);
//            } else {
//                throw new IllegalAccessException();
//            }
//        }catch (InvocationTargetException ex){
//            ex.printStackTrace();
//        }
        return null;
    }
}
