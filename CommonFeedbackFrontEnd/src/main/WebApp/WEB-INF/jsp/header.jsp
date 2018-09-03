<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

/* Style the body */
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

/* Header/logo Title */
.header {
	padding: 20px;
	text-align: center;
	background: #66b3ff;
	color: white;
}

/* Increase the font size of the heading */
.header h1 {
	font-size: 40px;
	font-color: black;
}

/* Style the top navigation bar */
.navbar {
	overflow: hidden;
	background-color: #033;
}

/* Style the navigation bar links */
.navbar a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 20px;
	text-decoration: none;
}

/* Main column */
.main {
	-ms-flex: 70%; /* IE10 */
	flex: 70%;
	background-color: white;
	padding: 20px;
}

/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 700px) {
	.row {
		flex-direction: column;
	}
}

/* Responsive layout - when the screen is less than 400px wide, make the navigation links stack on top of each other instead of next to each other */
@media screen and (max-width: 400px) {
	.navbar a {
		float: none;
		width: 100%;
	}
}
</style>
</head>

<body>

	<div class="header">
		<div class="col-sm-1">
			<a href="https://www.capgemini.com/"> <img
				src="\Images\logo.png" class=img-thumbnail height="45" width="65" />
			</a>
		</div>

		<h1>CapStore</h1>
	</div>

	<div class="navbar"></div>



</body>
</html>
