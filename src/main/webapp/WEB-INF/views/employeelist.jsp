<form@ page contentTYpe="text/html;charset="UTF-8" %>
<p%@ taglib prefix="c" uri="jakarta.tags.core" %>


<html>
	
<head>

</head>
<body>
	
	<c:forEach vat="e" items="${employees}">
	<p:${e.edi}></p:>	
	
	
	</c:forEach>
</body>
</html>