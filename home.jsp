<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>QARest</title>
<link rel="stylesheet" type="text/css"
	href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/qarest.css">
<!-- Optional Bootstrap theme -->
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<script src="resources/js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script src="resources/js/bootstrap.min.js" type="text/javascript"></script>
<script src="resources/js/jquery.validate.min.js" type="text/javascript"></script>
</head>
<body>
	<nav id="myNavbar"
		class="navbar navbar-default navbar-inverse navbar-fixed-top"
		role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbarCollapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">QARest</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="navbarCollapse">
				<ul class="nav navbar-nav">
				</ul>
				<ul class="nav navbar-nav pull-right">
					<li><a href="#" data-toggle="dropdown" class="dropdown-toggle"><span
							class="fa fa-user"></span> Welcome Guest <span class="caret"></span></a>
						<ul role="menu" class="dropdown-menu">
							<li><a href="#" data-toggle="modal"
								data-target="#modalAbout"><i
									class="fa fa-info-circle text-info" aria-hidden="true"></i>
									About</a></li>
							<li><a href="#" target="_blank" data-toggle="modal"
								data-target="#modalContact"><i class="fa fa-envelope"></i>
									Contact Us</a></li>
							<li class="divider"></li>
							<li><a href="#"><i class="fa fa-sign-out text-info"
									aria-hidden="true"></i> Logout</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1>
					<strong></strong>
				</h1>
			</div>
		</div>
		<br /> <br />
		<div class="row">

			<div class="col-sm-6 col-md-6 col-lg-6" id="divRequest">
				<form id="frmRequest" name="frmRequest">
					<div class="form-group">
						<p>
						<h2>Post a Request</h2>
						<p>
							<label for="txtInput" class="control-label"></label>
							<textarea rows="15" cols="65" id="txtInput" name="txtInput"
								required class="form-control"></textarea>
							<br />
						</p>
						<p>
							<!-- <input class="submit" type="submit" value="Submit"  id="btnSubmit" class="btn btn-success"/> -->
							<button type="submit" class="btn btn-success" name="submit"
								id="btnSubmit">Submit</button>
						</p>
					</div>
				</form>
			</div>
			<div class="clearfix visible-sm-block"></div>
			<div class="col-sm-6 col-md-6 col-lg-6" id="divResponse">
				<h2 class="text-success">Response Received</h2>
				<p>
				<pre id="output" class="text-success"></pre>
				<br />
				</p>

			</div>
			<div class="clearfix visible-md-block">< /div></div>
			<hr>
			<div class="row">
				<div class="col-sm-12">
					<footer>
						<p class="text-muted">© Copyright 2016 Platform-X Team</p>
					</footer>
				</div>
			</div>

		</div>
		<!-- Modal HTML -->
		<div id="modalAbout" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header text-primary">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h3 class="modal-title">
							<i class="fa fa-info-circle text-info" aria-hidden="true"></i>
							About
						</h3>
					</div>
					<div class="modal-body">
						<h3>QARest - A Component Based Test Tool</h3>
						<p>- A test tool to test individual components through REST
							Call</p>
					</div>
					<div class="modal-footer"></div>
				</div>
			</div>
		</div>
		<div id="modalContact" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header text-primary">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">×</button>
						<h3 class="modal-title">
							<i class="fa fa-envelope text-info" aria-hidden="true"></i>
							Contact Us
						</h3>
					</div>
					<div class="modal-body">

						<p>
							<i class="fa fa-user-circle-o fa-3x fa-pull-left text-warning"
								aria-hidden="true"></i>
						<h4 class="media-heading">Lakshmanan, Ramanathan</h4>
						<p>Ramanathan.Lakshmanan@wellsfargo.com</p>
						<br>
						</hr>

						<i class="fa fa-user-circle-o fa-3x fa-pull-left text-warning"
							aria-hidden="true"></i>
						<h4 class="media-heading">Baskaran, Karthiga</h4>
						<p>Karthiga.Baskaran@wellsfargo.com</p>
						<br>
						</hr>

						<i class="fa fa-user-circle-o fa-3x fa-pull-left text-warning"
							aria-hidden="true"></i>
						<h4 class="media-heading">Chamata, Naga rajendra</h4>
						<p>Nagarajendra.Chamata@wellsfargo.com</p>
						</p>
					</div>
					<div class="modal-footer"></div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			$.validator.addMethod("jsonValidate", function(value, element) {
				try {
					var val = $.parseJSON(value);
					return true;
				} catch (e) {
					return false;
				}
			}, 'Please provide valid JSON.');

			$(document).ready(function() {
				$("#divResponse").hide();

				$("#frmRequest").validate({
					// 1. validation rules.
					rules : {
						txtInput : {
							required : true,
							jsonValidate : true
						}
					},
					// 2. Validation fail messages
					messages : {
						txtInput : {
							required : "Please provide valid request."
						}
					},
					submitHandler : function(form) {
						getCBTResponse();
					}
				});
			});

			function getCBTResponse() {
				$("#divResponse").show();
				var input = $("#txtInput").val();
				$.ajax({
					type : "POST",
					url : "/cbt.web.client/cbtrest/cbt",
					data : input,
					contentType : "application/json; charset=utf-8",
					dataType : "json",
					success : function(data) {
						$('#output').text(JSON.stringify(data, null, '\t'));
					},
					error : function(errMsg) {
						if (errMsg.status == "500") {
							$('#output').text("Invalid JSON");
						} else {
							alert(errMsg);
						}
					}

				});

				return false;
			}
		</script>
</body>
</html>
