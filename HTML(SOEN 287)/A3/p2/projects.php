
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
                <br>
                <form  method="post">
                    <label for="msg8">My Projects</label><br>
                    <textarea id="msg8" name="Projects" placeholder="Write some message ..." ></textarea><br>
                    <input type="submit">
                </form>
                     
            </th>
    </table>
</body>
</html>
<?php
              
if(isset($_POST['Projects']))
{
$data1='My Projects:'.PHP_EOL.$_POST['Projects'].PHP_EOL;
$fp = fopen('project.txt', 'a');
fwrite($fp, $data1);
fclose($fp);
}
?>