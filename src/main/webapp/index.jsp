<%@ page import="yura.lukyanov.versionsComparator.hibernate.utils.HUtils" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="java.math.BigInteger" %>
<%@ page import="yura.lukyanov.versionsComparator.hibernate.primaryKeys.AttributePK" %>
<%@ page import="yura.lukyanov.versionsComparator.hibernate.Snapshot" %>
<%@ page import="yura.lukyanov.versionsComparator.hibernate.model.Attribute" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    Session hibSession = HUtils.getSessionFactory().openSession();
    hibSession.beginTransaction();

    Snapshot snapshot = (Snapshot) hibSession.get(Snapshot.class, new BigInteger("1"));
    Attribute attr = (Attribute) hibSession.get(Attribute.class, new AttributePK(snapshot, new BigInteger("4090273757013652974")));

%>

    <p>NAME: <%= attr.getName() %> || snapshot: <%= attr.getSnapshot().getVersionName() %></p>

<%--    yura.lukyanov.versionsComparator.hibernate.model.ObjectType objType = (yura.lukyanov.versionsComparator.hibernate.model.ObjectType) hibSession.get(yura.lukyanov.versionsComparator.hibernate.model.ObjectType.class, new BigInteger("99100110"));
    yura.lukyanov.versionsComparator.hibernate.model.AttrGroup attrGroup = (yura.lukyanov.versionsComparator.hibernate.model.AttrGroup) hibSession.get(yura.lukyanov.versionsComparator.hibernate.model.AttrGroup.class, new BigInteger("8120266260013867690"));

%>

    <p><%= attr.getName() %></p>

<h2><%= attrGroup.getName()%> :</h2>

<%
    for(yura.lukyanov.versionsComparator.hibernate.model.Attribute attr1 : attrGroup.getAttributes()) {
%>
<p>ATTR14: <%= attr1.getName() %> </p>
<%
    }

%>

<p>Attributes for <%= objType.getName() %>:</p>

<%
    for(yura.lukyanov.versionsComparator.hibernate.model.AttrObjectType attrObjectType : objType.getAttrObjectTypes()) {
        %>
        <p>ATTR: <%= attrObjectType.getAttribute().getName() %>
            || ObjectType: <%= attrObjectType.getObjectType().getName() %>
            || AttrSchema: <%= attrObjectType.getAttributeSchema().getIsSystem() %> </p>
<%
    }

    --%>
<%
    hibSession.close();
    HUtils.shutdown();
%>

</body>
</html>
