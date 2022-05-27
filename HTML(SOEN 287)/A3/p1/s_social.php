
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
                <form action="r_social.php" method="get">
                    <label for="msg11">Social Link 1(fb):</label><br>
                    <input name="textd10" type="text" id="msg11"><br>
                    <label for="msg12">Social Link 2(ins):</label><br>
                    <input name="textd11" type="text" id="msg12"><br>
                    <label for="msg13">Social Link 3(twitter):</label><br>
                    <input name="textd12" type="text" id="msg13"><br>
                    <input type="submit">
                </form>
            </th>
    </table>

</body>

</html>