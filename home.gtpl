<!DOCTYPE html>
<html lang="zh-CN">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<title>go-gif</title>
	<style>
		body {
			padding-top: 50px;
		}
	</style>
</head>

<body>
	<nav>

	</nav>

	<div class="container">
		<h3>go-gif</h3>
		<div class="jumbotron">
			<form enctype="multipart/form-data" action="upload" method="post">
				<div class="form-group">
					<label for="exampleInputFile"></label>
					<input type="file" name="uploadFile" id="exampleInputFile" />
					<p class="help-block">注意只能选视频</p>
				</div>
				<button type="submit" class="btn btn-default">提交</button>
			</form>
		</div>


		<p>
		<h3>结果列表</h3>
		</p>
		<div id="gif-list" style="height: auto;"></div>
		<a href="javascript:location.reload();" class="btn btn-default">点击刷新页面</a>
	</div>

	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<script>
		$("#gif-list").load("files/?"+new Date().getTime(), function () {
			$("#gif-list a").each(function () {
				var old_href = $(this).attr('href');
				$(this).attr('href', 'files/' + old_href);
			});
		});
	</script>
</body>

</html>