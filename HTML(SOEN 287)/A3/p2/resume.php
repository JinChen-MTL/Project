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
if(isset($_SESSION["favanimal"]))
 echo $_SESSION["favanimal"];
else

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
                    <label for="msg3">name:</label><br>
                    <input type="text" id="msg3" name="name" placeholder="Write some message ..." > <br>
                    <label for="msg4">email:</label><br>
                    <input type="email" id="msg4" name="email" placeholder="Write some message ..." > <br>
                    <label for="msg5">phone_number:</label><br>
                    <input type="text" id="msg5" name="phone_number" placeholder="Write some message ..." > <br>
                    <label for="msg6">Message box:</label><br>
                    <textarea id="msg6" name="Message" placeholder="Write some message ..." ></textarea><br>
                    <input type="submit"/>
                </form>
            </th>
    </table>
</body>

</html>
<?php
              
if(isset($_POST['name'])&isset($_POST['email'])&isset($_POST['phone_number'])&isset($_POST['Message']))
{
$data3='name:'.PHP_EOL.$_POST['name'].PHP_EOL;
$data4='email:'.PHP_EOL.$_POST['email'].PHP_EOL;
$data5='phone_number:'.PHP_EOL.$_POST['phone_number'].PHP_EOL;
$data6='Message box:'.PHP_EOL.$_POST['Message'].PHP_EOL;
$fp = fopen('resume.txt', 'a');
$dataF=$data3.$data4.$data5.$data6;
fwrite($fp, $dataF);
fclose($fp);
}
?>