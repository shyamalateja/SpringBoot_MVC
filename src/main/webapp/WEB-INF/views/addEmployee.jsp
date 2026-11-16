
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Add Employee</title>
    <link rel="stylesheet" href="css/style.css">
</head>

<body>

    <div class="container">
        <h2>Add Employee Data</h2>

        <form action="/employees/saveEmp" method="post">

            <label>Employee Name</label>
            <input type="text" name="ename" placeholder="Enter employee name" required />

            <label>Employee Salary</label>
            <input type="number" name="salary" placeholder="Enter employee salary" required />

            <input type="submit" value="Register" />

        </form>
    </div>

</body>
</html>
