<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
    <script src="js.js"></script>
</head>
<?php
session_start();
if( $_SESSION["forin"]=="jin"){
    echo "Status: Login";
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
     
                <form action="r_project.php" method="get">
                <label for="msg10">My Projects</label><br>
                <textarea id="msg10" name="textd9"></textarea><br>
                <input type="submit">
</form>
            </th>
    </table>
</body>

 