let validationCheck = function(differenceDay) {
    if(differenceDay < 0) {
        alert("시작날짜의 값이 더 큼니다.");
        $('#startDate').val("");
        $('#endDate').val("");
        return false;
    }else return true;
}


let makeCalendar = function (startYear, startMonth, startDay, endDay, differenceYear, differenceMonth) {
            /* 현재 월의 1일에 요일을 구합니다. 
           그럼 그달 달력에 첫 번째 줄 빈칸의 개수를 구할 수 있습니다.*/
           let theDate = new Date(startYear, startMonth, startDay);
           let dayOfTheWeek = theDate.getDay(); //요일 
           let lastDate = 0;
   
           if(differenceYear === 0 && differenceMonth === 0) {
               lastDate = endDay;
           }else {
               //1월부터 12월까지 마지막 일을 배열로 저장함.
               let last = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
               /*현재 연도가 윤년(4년 주기이고 100년 주기는 제외합니다. 
               또는 400년 주기)일경우 2월에 마지막 날짜는 29가 되어야 합니다.*/
               if(startYear % 4 == 0 && startYear % 100 !=0 || startYear % 400 == 0) {
                   last[1] = 29;
               }
                   lastDate = last[startMonth]; //현재 월에 마지막이 몇일인지 구합니다.
           }
   
            /*③ 현재 월의 달력에 필요한 행의 개수를 구합니다.
            var row(행의 개수)= Math.ceil( (theDay(빈 칸)+lastDate(월의 전체 일수)) / 7)*/
   
           let row = Math.ceil((dayOfTheWeek+lastDate)/7); //필요한 행수
   
           let dayNumber = startDay;
           let strTbodyInTrTd = "";
   
           for(let i = 1; i <= row; i++) {
               strTbodyInTrTd += "<tr>";
               for(let j = 1; j <= 7; j++) {
                   if(i == 1 && j <= dayOfTheWeek || dayNumber > lastDate) {
                       strTbodyInTrTd += "<td>&nbsp;</td>";
                   }else {
                       strTbodyInTrTd += "<td>"+dayNumber+"</td>";
                       dayNumber++;
                   }
               }
               strTbodyInTrTd += "</tr>";
           }
           document.getElementById("calendar-tbody").innerHTML = strTbodyInTrTd;
}
    function changeMonthNumberString(monthTemp) {
        switch (monthTemp) {
            case 1: return "Jan";
            case 2: return "Feb";
            case 3: return "Mar";
            case 4: return "April";
            case 5: return "May";
            case 6: return "Jun";
            case 7: return "Jul";
            case 8: return "Aug";
            case 9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default : return "";
        }
    }

    function clearCalendar() {
        document.getElementById("calendar-tbody").innerHTML="";
    }

    function changeYearMonth(startYear, monthName) {
        $("#year").text("시작년: "+startYear+"년");
        $("#month").text("시작달: "+monthName);
    }