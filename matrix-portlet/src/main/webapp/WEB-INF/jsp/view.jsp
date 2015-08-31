<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<portlet:actionURL name="feedMatrix" var="feedTheMatrixUrl"></portlet:actionURL>

<aui:form action="${feedTheMatrixUrl}" name="feedMatrixForm" method="post" cssClass="myfeeder">

    <aui:layout>
        <aui:row >
            <aui:input name="matrixName" label="matrix.name"/>
        </aui:row>
        <aui:row>
            <aui:input name="positionX" label="matrix.pos.x"/>
        </aui:row>
        <aui:row>
            <aui:input name="positionY" label="matrix.pos.y"/>
        </aui:row>
        <aui:row>
            <aui:select name="dataType" label="matrix.data.type">
                <aui:option value="String" selected="true">String</aui:option>
                <aui:option value="Integer" >Integer</aui:option>
                <aui:option value="Date" >Date</aui:option>
                <aui:option value="Object" >Object</aui:option>
            </aui:select>
        </aui:row>
        <aui:row>
            <aui:input name="dataValue" label="matrix.data.value"/>
        </aui:row>
    </aui:layout>


    <aui:button-row>
        <aui:button name="saveButton" type="submit" value="save"  />
        <aui:button name="cancelButton" type="button" value="cancel" />
    </aui:button-row>
</aui:form>