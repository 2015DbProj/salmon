<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" session="false" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="utf-8">
    <link href="//cdn.rawgit.com/openhiun/hangul/14c0f6faa2941116bb53001d6a7dcd5e82300c3f/nanumbarungothic.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="resources/css/common.css" />
    <link rel="stylesheet" href="resources/css/main.css" />
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    
    <script>
    	$("button").click(function(){
    		$("form").submit();
    	});
    </script>
</head>
<body>
    <header></header>
    <div id="contents">
        <div id="login">
            <form action='<c:url value="/user/login"/>' method="post">
	            <input name="email" type="text" placeholder="ID" />
	            <input id="saveID" name="saveID" type="checkbox" value="true" /><label for="saveID">ID 저장</label>
	            <input name="passwd" type="password" placeholder="Password" />
	            <button>로그인</button>
	            <div style="text-align: center;">
	                <a class="btn" href="registForm.skhu">회원가입</a><a class="btn">ID/PW찾기</a>
	            </div>
            </form>
        </div>
        <div id="notice">
            <span class="title">공지사항</span>
            <ul>
                <li>서비스 공지 1 <span class="date">2015.12.31.</span></li>
                <li>DDoS 공격에 따른 긴급 조치: 해외 접속 차단 <span class="date">2015.12.31.</span></li>
                <li>신년맞이 이벤트: 상담을 한 번 받으면 무료로 한 번 더! <span class="date">2015.12.31.</span></li>
                <li>서비스 공지 4 <span class="date">2015.12.31.</span></li>
                <li>신기한 상담상자 이벤트: 상담을 신청하면 상담 방법과 시간이 자동으로 결정된다. <span class="date">2015.12.31.</span></li>
                <li>서비스 공지 6 <span class="date">2015.12.31.</span></li>
                <li>서비스 공지 7 <span class="date">2015.12.31.</span></li>
            </ul>
        </div>
    </div>
    <footer>
        COPYRIGHT (C)2016~ SUNGKONGHOE UNIVERSITY. ALL RIGHTS RESERVED. CREDIT.<br />
        152-716 서울특별시 구로구 연동로 320 성공회대학교 TEL 02-2610-4114 FAX 02-2683-8858
    </footer>
</body>
</html>