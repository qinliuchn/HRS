package Client.businesslogic.orderbl;

import Common.vo.OrderVO;

import java.util.ArrayList;

/**
 * Created by arloor on 2016/11/6.
 */
public class HotelOrderList extends OrderList {
    ArrayList<OrderVO> orderVOlist=new ArrayList<>();
    OrderLineItem oListItem;

    public HotelOrderList(String tag){
        orderVOlist.add(new OrderVO(0,tag,"汉庭","未执行","标准间",1,2,"无小孩","0","0",250,200,2000));
        orderVOlist.add(new OrderVO(1,tag,"如家","未执行","大床房",1,2,"有小孩","0","0",300,280,2800));
    }
}
