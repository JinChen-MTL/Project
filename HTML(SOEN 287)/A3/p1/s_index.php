<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
</head>
<?php
session_start();
if($_POST["Username"]=="jin"&& $_POST["Password"]=="123"&& $_POST["Login_Time"]=="2022"&& $_POST["Login_User-Agent"]=="tom"){
    echo "Status: Login";
    $_SESSION["forin"]=$_POST["Username"];
 }else{
    header("Location: http://localhost/p1/admin.php");
}
?>
<body>
    <table id="t1">
        <tr>
            <th>
                <div id="bar">
                <a href="s_index.php">
                        Home
                    </a>
                    <a href="s_resume.php">
                        Resume
                    </a>
                    <a href="s_project.php">
                        Projects
                    </a>
                    <a href=" contact.html">
                        Contact
                    </a>
                    <a href="s_social.php">
                        Social
                    </a>
                    <a href="fulllogout.php">
                        logout
                    </a>
                </div>
                <br>
                <form action="r_index.php" method="get">
                <label for="msg5">Professional Statement</label><br>
                <textarea id="msg5" name="textd2"></textarea><br>
                <label for="msg6">Brief Biography</label><br>
                <textarea id="msg6" name="textd3"></textarea><br>
                         <input type="submit">
</form>
            </th>
    </table>
</body>

 