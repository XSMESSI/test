package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * @Author: Leo messi
 * @Date: 2022/05/22/13:22
 * @Description: 关于开发团队成员的管理：添加、删除等
  */

public class TeamService {

    private static int counter = 1;//给memberId赋值使用
    private final int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队中实际的人数

    public TeamService() {
        super();
    }

    /**
     * 获取开发团队中的所有成员
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0;i < team.length;i++){
            team[i] = this.team[i];
        }
        return team;
    }



/**
 * 将指定的员工添加到开发团队中
 */
    public void addMember(Employee e) throws TeamException {

         //* 成员已满，无法添加
        if (total > MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }

        //* 该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        //* 该员工已在本开发团队中
        if (isExist(e)){
            throw new TeamException("该员工已在本开发团队中");
        }
        //* 该员工已是某团队成员

        //* 该员正在休假，无法添加

        Programmer p = (Programmer) e;
//        if ("BUSY".equals(p.getStatus().getNAME())) {
//            throw new TeamException("该员工已是某团队成员");
//        }else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())){
//            throw new TeamException("该员正在休假，无法添加");
//        }
        switch (p.getStatus()){
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员正在休假，无法添加");
        }
        //* 团队中至多只能有一名架构师
        //* 团队中至多只能有两名设计师
        //* 团队中至多只能有三名程序员

        //获取team中已有成员中架构师，设计师，程序员的人数
        int numOfArch = 0,numOfDes = 0,numOfPro = 0;
        for (int i = 0;i < total;i++){
            if (team[i] instanceof Architect){
                numOfArch++;
            }else if (team[i] instanceof Designer){
                numOfDes++;
            }else if (team[i] instanceof Programmer){
                numOfPro++;
            }
        }


        if (p instanceof Architect){
            if (numOfArch >=1){
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer){
            if (numOfDes >= 2){
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer){
            if (numOfPro >= 3){
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        //将p(或e)添加到现有的team中
        team[total++] = p;
        //开发团队中的p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }

    /**
     * 判断指定的员工是否已经在现有的开发团队中
     * @param e
     * @return
     */
    private boolean isExist(Employee e) {
        for (int i = 0;i < total;i++){
            if (team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }


    /**
     * 删除团队成员
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (;i < total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        //未找到指定id的情况
        if (i == total){
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

//        for (int j = i + 1;j < total;j++){
//            team[j - 1] = team[j];
//        }

        //后一个元素覆盖前一个元素，实现删除操作
        for (int j = i;j < total - 1;j++){
            team[j-1] = team[j];
        }

        //写法一
//        team[total - 1] = null;
//        total--;
        //或
        //写法二
        team[total--] = null;


    }
}
