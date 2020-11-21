<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello World!</title>
  </head>
  <body>
    <s:form action="login">
      <s:textfield name="person.name" label="Name" type="text" value=""/>
      <s:textfield name="person.password" label="Password" type="password" value=""/>
      <s:submit/>
    </s:form>	
  </body>
</html>
