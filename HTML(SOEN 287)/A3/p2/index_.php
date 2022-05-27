
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
    <script src="js.js"></script>
</head>

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

                <form  method="post">
                    <label for="msg1">Professional Statement</label><br>
                    <textarea id="msg1" name="P_S" placeholder="Write some message ..."></textarea><br>
                    <label for="msg2">Brief Biography</label><br>
                    <textarea id="msg2" name="B_B" placeholder="Write some message ..."></textarea><br>
                    <input type="submit">
                </form>
 
            </th>
    </table>
</body>
</html>

<?php
              
if(isset($_POST['P_S'])&isset($_POST['B_B']))
{
$data1='Professional Statement:'.PHP_EOL.$_POST['P_S'].PHP_EOL;
$data2='Brief Biography:'.PHP_EOL.$_POST['B_B'].PHP_EOL;
$fp = fopen('index.txt', 'a');
fwrite($fp, $data1);
fwrite($fp, $data2);
fclose($fp);
}
?>