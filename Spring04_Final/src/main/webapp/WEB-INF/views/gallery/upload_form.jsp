<%--
  Created by IntelliJ IDEA.
  User: acorn
  Date: 2023-07-03
  Time: 오후 4:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>gallery/upload_form</title>
</head>
<body>
<div class="container">
    <h3>갤러리 업로드 폼입니다.</h3>
    <form action="${pageContext.request.contextPath}/gallery/upload" method="post" enctype="multipart/form-data"
          id="imageForm">
        <div>
            <label for="caption">사진 설명</label>
            <input type="text" name="caption" id="caption">
        </div>
        <div>
            <label for="imageForm">사진</label>
            <input type="file" name="image" id="image" accept=".jpg, .png, .gif"/>
        </div>
        <button type="submit">업로드</button>
    </form>
</div>
<script src="${pageContext.request.contextPath }/resources/js/gura_util.js"></script>
<script>
    document.querySelector("#image").addEventListener("change", function () {
        const form = document.querySelector("#imageForm");
        ajaxFormPromise(form)
            .then(function (response) {
                return response.json();
            })
            .then(function (data) {
                console.log(data);
                // input name="profile" 요소의 value 값으로 이미지 경로 넣어주기
                document.querySelector("input[name=image]").value = data.imagePath;
                let img = `<img id="profileImage"
					src="${pageContext.request.contextPath }\${data.imagePath}">`;
                console.log("updateform :" + data.imagePath);
                console.log("imgString :" + img);

                //id 가 profileLink 인 요소의 내부(자식요소)에 덮어쓰기 하면서 html 형식으로 해석해 주세요 라는 의미
                document.querySelector("#profileLink").innerHTML = img;
            });
    })
</script>
</body>
</html>
