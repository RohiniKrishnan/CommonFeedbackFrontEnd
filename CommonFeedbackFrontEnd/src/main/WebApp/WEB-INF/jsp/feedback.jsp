<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
    <%@include file="footer.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
body {
    background-color: white;
}


input[type=text], textarea {
    width: 50%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
}

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}
.col-25 {
    float: left;
    width: 25%;
    margin-top: 6px;
}
.col-75 {
    float: left;
    width: 75%;
    margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}
input[type=submit] {
    background-color: #66b3ff;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float:
	}
	@media screen and (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
}

</style>
</head>

<body>

<h2>Feedback survey</h2>
<div class="container">
  <form action="/CustomerFeedback" >
  <div class="row">
      <div class="col-25">
        <label for="ProductId">Product Id</label>
      </div>
      <div class="col-75">
        <input type="text" id="ProductId" name="ProductId" placeholder="Your product id..">
      </div>
    </div>
	<div class="row">
	<div class="col-25">
	<label for="feedback">Feedback</label>
	</div>
	<div class="col-75">
	<textarea id="feedback" name="feedback" placeholder="Write your feedback here.." style="height:200px"></textarea>
	</div>
	</div>
	<div class="row">
	<input type="submit" id="submit" name="submit" value="Submit Feedback">
	</div>
	<form>
	</div>


</body>

</html>