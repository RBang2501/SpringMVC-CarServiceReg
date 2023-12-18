<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>



<html>
    <div>
        <h1>
            This is Signup Page !
        </h1>
        <form:form action="registerUser" modelAttribute="user">
            Name: <form:input path="name"></form:input>
            <br/>
            <br/>
            Gender:
            <br/>
            Male: <form:radiobutton path="gender" value="male"></form:radiobutton>
            Female: <form:radiobutton path="gender" value="female"></form:radiobutton>
            <input type="submit">

        </form:form>
        
    </div>
</html>