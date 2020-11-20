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
      <s:textfield name="name" label="Name" type="text" />
      <s:textfield name="password" label="Password" type="password"/>
      <s:submit/>
    </s:form>	
  </body>
</html>
