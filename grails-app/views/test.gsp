<%@ page import="grails.util.Holders" contentType="text/html;charset=UTF-8" %>
<html>
<body>
<%-- Arbitrarily oversimplified --%>
${Holders.applicationContext.personService.testTemporaryCreate("${source}")}
</body>
</html>