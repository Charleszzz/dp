package com.charles.dp.proxy.handler;

import com.charles.dp.proxy.bean.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author: zhangyong
 * Date: 16/8/7
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean person;
    public OwnerInvocationHandler(PersonBean person){
        this.person = person;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")){
                return method.invoke(person,args);
            }else if (method.getName().equalsIgnoreCase("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if (method.getName().startsWith("set")){
                return method.invoke(person,args);
            }
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
