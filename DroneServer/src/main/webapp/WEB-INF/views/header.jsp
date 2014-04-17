<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id=mainlayout>
	<div id=header> 
		<h1>UGV - Drone Mk I</h1>
		
		<nav id=menu>
			<ul>
				<li><a href="<c:url value = "/" />">Home</a></li>
				<li><a href="#">Status</a></li>
				<li><a href="#">Log</a></li>
				<li><a href="<c:url value = "/about" />">About</a></li>
			</ul>
		</nav>		
	</div>
	
	<div id=footer>Beta Version 0.5</div>
</div>
