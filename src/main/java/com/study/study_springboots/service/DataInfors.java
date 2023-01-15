package com.study.study_springboots.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.study.study_springboots.beans.BoardBean;

public class DataInfors {
    public HashMap<String, String> getSearchFormData() {
        HashMap<String, String> searchForm = new HashMap<String, String>();
        searchForm.put("search_key", "Search Title");
        searchForm.put("name", "HNNNY!");
        searchForm.put("id", "ID0001");

        return searchForm;
    }

    public ArrayList<String> getTablesListWithString() {
        ArrayList<String> tablesListWithString = new ArrayList<String>();
        tablesListWithString.add("@mdo");
        tablesListWithString.add("@fat");
        tablesListWithString.add("@twitter");

        return tablesListWithString;
    }

    public HashMap<String, Object> getBundlesData() {
        DataInfors DataInfors = new DataInfors();
        HashMap<String, String> searchForm = DataInfors.getSearchFormData();
        ArrayList<String> tablesListWithString = DataInfors.getTablesListWithString();

        HashMap<String, Object> bundlesData = new HashMap<>();
        bundlesData.put("searchForm", searchForm);
        bundlesData.put("tablesListWithString", tablesListWithString);

        // bundlesData.put("dataWithMamberBean", DataInfors.getDataWithMamberBean());
        bundlesData.put("dataListWithBoardBean", DataInfors.getDataListWithBoardBean());

        return bundlesData;
    }

    public BoardBean getDataWithBoardBean(){
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }


    public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();

        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("Mark");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("jacob");
        boardBean.setContent("Thorton");
        boardBean.setUserName("@fat");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("Larry");
        boardBean.setContent("Bird");
        boardBean.setUserName("@twitter");
        membersList.add(boardBean);

        return membersList;
    }

    public ArrayList<BoardBean> getDataListWithBoardBeanNewsList() {
        ArrayList<BoardBean> membersList = new ArrayList<>();

        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("눈·비 온 뒤 기온 뚝… 이번주 전국이 영하권으로 춥다");
        boardBean.setContent("눈·비가 그친 16일부터 제주를 제외한 전국이 영하권에 접어들겠다. 평년보다 낮은 강추위는 이번 주 내내 지속될 전망이다. " + 
        "15일 기상청은 16일 아침 최저기온을 영하 12~0도, 낮 최고기온을 영하 3~ 영상 7도로 예보했다.");
        boardBean.setUserName("김현종 기자");
        boardBean.setDate("2023-01-15");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("‘한국소설문학상’ 문상오·민금애 작가");
        boardBean.setContent("한국소설가협회는 15일 ‘제48회 한국소설문학상’ 수상작으로 문상오 소설가의 중편 '아, 시루섬'과 민금애 소설가의 단편 '옹고집 사랑'을 선정했다. " + 
        "심사위원회는 '아, 시루섬'에 대해 자연재해 공포 속에서 주민들이 한마음으로 위기를 극복해 간 서사를 박진감 있게 서술했으며, '옹고집 사랑'은 우리 시대의 상징적 사랑 이야기라고 각각 평가했다.");
        boardBean.setUserName("임인택 기자");
        boardBean.setDate("2023-01-15");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("[우리말 바루기] ‘오픈 스페이스’의 우리말?");
        boardBean.setContent("국립국어원은 지난해 외국어 용어를 우리말로 다듬은 말 가운데 ‘오픈 스페이스’를 ‘열린 쉼터’로 바꾸어 쓰도록 한 것이 가장 좋은 평가를 받았다고 최근 밝혔다." +
        "국민 2000명을 대상으로 실시한 수용도 조사에서 이렇게 평가한 비율이 93.1%를 차지했다는 것이다. ‘오픈 스페이스(open space)’는 도시 계획에서 사람들에게 놀이 활동을 하게 하거나 " + 
        "마음의 편안함을 줄 목적으로 마련한 공간을 이르는 말이다.");
        boardBean.setUserName("배상복 기자");
        boardBean.setDate("2023-01-16");
        membersList.add(boardBean);
        return membersList;
    }
    
    public BoardBean getDataListWithBoardBeanNewsView(String title) {
        ArrayList<BoardBean> newsList = getDataListWithBoardBeanNewsList();
        BoardBean boardBean = new BoardBean();

        for(int i = 0; i < newsList.size(); i++) {
            BoardBean view = newsList.get(i);
            if(title.equals(view.getTitle())) {
                boardBean.setTitle(view.getTitle());
                boardBean.setContent(view.getContent());
                boardBean.setUserName(view.getUserName());
                boardBean.setDate(view.getDate());
                
                return boardBean;
            } else {
                boardBean.setTitle("");
                boardBean.setContent("");
                boardBean.setUserName("");
                boardBean.setDate("");
            }
        }
        return boardBean;
    }
}