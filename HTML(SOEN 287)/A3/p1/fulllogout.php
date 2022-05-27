<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
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
                    <a href="fulllogout.html">
                        logout
                    </a>
                    <button onclick="http://localhost/p1/logout.php">logout</button>

                </div>
                <br>

            </th>
    </table>
</body>