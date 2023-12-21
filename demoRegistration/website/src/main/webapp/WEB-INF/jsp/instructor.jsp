<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<html>
    <h1>Here are your Instructors:</h1>
    <%
        ArrayList<HashMap<String, Object>> listOfInstructors = (ArrayList<HashMap<String, Object>>)
            request.getAttribute("listOfInstructors");

        for(HashMap<String, Object> instructor: listOfInstructors){
    %>
    name: <%= instructor.get("name") + " "%>
    
    <a href="profile/<%=instructor.get("id")%>">profile</a>
    </br>
    <%      
        }
    %>
</html>