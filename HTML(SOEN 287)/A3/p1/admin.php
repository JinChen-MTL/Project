<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Assignemnt 2</title>
    <link rel="stylesheet" href="css.css">
</head>

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
                </div>
                <br>
                <form name="myForm" method="post" action="s_index.php">
                    <label for="a11">Username</label><br>
                    <input id="a11" type="text" name="Username"><br>
                    <label for="a12">Password</label><br>
                    <input id="a12" type="password" name="Password"><br>
                    <label for="a13">Login_Time</label><br>
                    <input id="a13" type="text" name="Login_Time"><br>
                    <label for="a14">Login_User-Agent</label><br>
                    <input id="a14" type="text" name="Login_User-Agent"><br>
                    <input type="submit" value="Click Me" >
                </form>
            </th>
    </table>
</body>