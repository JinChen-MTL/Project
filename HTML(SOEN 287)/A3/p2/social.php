<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
    <script src="js.js"></script>
</head>
<?php
// Start the session
session_start();
?>
 

<?php
// Set session variables
$_SESSION["favcolor"] = "green";
$_SESSION["favanimal"] = "cat";
echo "Session variables are set.";
?>
<body>
    <table id="t1">
        <tr>
            <th>
            <div id="bar">
                    <a href="index.php">
                        Home
                    </a>
                    <a href="resume.php">
                        Resume
                    </a>
                    <a href="projects.php">
                        Projects
                    </a>
                    <a href="contact.php">
                        Contact
                    </a>
                    <a href="social.php">
                        Social
                    </a>
                    <a href="logout.php">
                        logout
                    </a>
                </div>
                <br>
                <form method="post" >
                    <label for="msg9">Social Link 1:</label><br>
                    <input name="s1" type="text" id="msg9"><br>
                    <label for="msg10">Social Link 2:</label><br>
                    <input type="text" name="s2" id="msg10"><br>
                    <label for="msg11">Social Link 3:</label><br>
                    <input type="text" name="s3" id="msg11"><br>
                </form>
            </th>
    </table>
</body>

</html>
<?php
if(isset($_POST['s1'])&isset($_POST['s2'])&isset($_POST['s3']))
{
$data7='Social Link 1:'.PHP_EOL.$_POST['s1'].PHP_EOL;
$data8='Social Link 2:'.PHP_EOL.$_POST['s2'].PHP_EOL;
$data9='Social Link 3:'.PHP_EOL.$_POST['s3'].PHP_EOL;
$fp = fopen('social.txt', 'a');
$dataF=$data7.$data8.$data9;
fwrite($fp, $dataF);
fclose($fp);
}
?>
