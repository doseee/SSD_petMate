<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="site-section bg-light">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="section-title mb-5">
					<h2>펫시터 구인 폼</h2>
				</div>
				<form:form name="form" modelAttribute="petsitter" action="petsitterInsert" method="post">
					<div class="row">
						<div class="col-md-6 form-group">
							<label for="boardTitle">제목</label> 
							<form:input path="boardTitle" class="form-control form-control-lg" />
						</div>
					</div>
					<div class="row">
						<div class="col-md-6 form-group">
							크기
							<br />
							<form:checkboxes items="${sizeCodes}" itemLabel="label" itemValue="code" path="sizeCodes" />
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 form-group">
							<label for="petDay">요일</label>
							<br />
							<form:checkboxes items="${dayCodes}" itemLabel="label" itemValue="code" path="dayCodes" />
						</div>
					</div>
					<div class="row">
						<div class="col-md-6 form-group">
							<label for="petPrice">가격</label> 
							<form:input path="petPrice" class="form-control form-control-lg" />
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 form-group">
							<label for="petLocal">지역</label>
							<br />
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="서울"> 서울
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="경기도"> 경기도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="강원도"> 강원도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="충청남도"> 충청남도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="충청북도"> 충청북도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="전라남도"> 전라남도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="전라북도"> 전라북도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="경상남도"> 경상남도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="경상북도"> 경상북도
							</label>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label class="radio-inline">
			  					<input type="radio" name="petLocal" id="petLocal" value="제주도"> 제주도
							</label>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 form-group">
							<label for="boardContent">글 쓰기</label>
							<form:textarea path="boardContent" id="boardContent" cols="30" rows="10"
								class="form-control" style="width:120%" />
						</div>
					</div>
					<div class="row">
						<div class="col-12">
							<input type="submit" value="등록"
								class="btn btn-primary py-3 px-5">
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	var oEditors = [];
	nhn.husky.EZCreator.createInIFrame({
		oAppRef: oEditors,
		elPlaceHolder: "message",
		sSkinURI: "resources/se2/SmartEditor2Skin.html",
		fCreator: "createSEditor2"
	});

	function sumSize() {
		var sum = 0;
		for (var i = 0; i < 3; i++) {
			if (document.getElementsByName("petSize")[i].checked) {
				alert(document.getElementsByName("petSize")[i]);
				sum += parseInt(document.getElementsByName("petSize")[i].value);
			}
		}
		document.getElementsByName("sumSize").value = sum;
	}
</script>