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
                    <a href="fulllogout.php">
                        logout
                    </a>
                </div>
                <br>
                <form action="r_resume.php" method="get">
                <label for="msg1">Educational Qualifications</label><br>
                <textarea id="msg1" name="textd3"></textarea><br>
                <label for="msg2">Skill Set</label><br>
                <textarea id="msg2" name="textd4"></textarea><br>                
                <label for="msg3">Awards/Recognition</label><br>
                <textarea id="msg3" name="textd5"></textarea><br>                
                <label for="msg4">Work Experience</label><br>
                <textarea id="msg4" name="textd6"></textarea><br>
                <label for="msg7">Referees</label><br>
                <textarea id="msg7" name="textd7"></textarea><br>
                <input type="submit">
</form>
            </th>
    </table>
</body>
