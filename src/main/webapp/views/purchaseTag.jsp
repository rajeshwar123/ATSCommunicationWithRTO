<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tag Purchase</title>
</head>
<body>
<a href="localhost:9091/atps/homepage">home</a>
	<form action="getTag">
		<table>
			<tr>
				<td>Vehicle Reg Number</td>
				<td><input type="text" name="vhclRgNum"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Search"></td>
			</tr>
			</table>
			<table border="1">
			<tr>
				<td colspan="2" style="color: Red">Vehicle Owner Details..</td>
			</tr>

			<tr>
				<td>Name</td>
				<td>${vhclSummaryData.onrDtls.fname}</td>
			<tr>
			<tr>
				<td>Last Name</td>
				<td>${vhclSummaryData.onrDtls.lname}</td>
			</tr>
			<tr>
				<td>Email Id::</td>
				<td>${vhclSummaryData.onrDtls.email}</td>
			</tr>
			<tr>
				<td>Dob</td>
				<td>${vhclSummaryData.onrDtls.dob}</td>
			</tr>
			<tr>
				<td>SSN No</td>
				<td>${vhclSummaryData.onrDtls.ssn}</td>
			</tr>
			<tr>
				<td>house No</td>
				<td>${vhclSummaryData.onrAddtsDtls.hno}</td>
			</tr>
			<tr>
				<td>Street No</td>
				<td>${vhclSummaryData.onrAddtsDtls.streetno}</td>
			</tr>
			<tr>
				<td>City Name</td>
				<td>${vhclSummaryData.onrAddtsDtls.city}</td>
			</tr>
			<tr>
				<td>Vehicle Type</td>
				<td>${vhclSummaryData.vhclDtls.type}</td>
			</tr>
			<tr>
				<td>Vehicle Company</td>
				<td>${vhclSummaryData.vhclDtls.vcompanyname}</td>
			</tr>
			<tr>
				<td>Vehicle Model Year</td>
				<td>${vhclSummaryData.vhclDtls.year}</td>
			</tr>
			<tr>
				<td>Vehicle Type</td>
				<td>${vhclSummaryData.vhclDtls.type}</td>
			</tr>
			<tr>
				<td>Vehicle Reg No::</td>
				<td>${vhclSummaryData.vhclRegDtls.regNo}</td>
			</tr>
			<tr>
				<td>Vehicle Reg Center::</td>
				<td>${vhclSummaryData.vhclRegDtls.regCenter}</td>
			</tr>
			<tr>
				<td>Vehicle Reg Date::</td>
				<td>${vhclSummaryData.vhclRegDtls.regDate}</td>
			</tr>
		</table>
		
		
		Vehicle Summary::${vhclSummaryData}
		<a href="#">Proceed...</a>
	</form>
</body>
</html>