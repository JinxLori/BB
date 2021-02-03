package com.android.loginui.fragment.Two;

import com.android.loginui.R;
import com.ramotion.expandingcollection.ECCardData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExampleDataset {

    private List<ECCardData> dataset;

    public ExampleDataset() {
        dataset = new ArrayList<>();

        CardData item5 = new CardData();
        item5.setMainBackgroundResource(R.drawable.attractions);
        item5.setHeadBackgroundResource(R.drawable.attractions_head);
        item5.setHeadTitle("\t\t\t\t\t\t一天\t\t\t\t\t");
        item5.setPersonMessage("我像是连续嚼到坏了的瓜子，一颗颗，不知道什么时候能吃个好的。");
        item5.setPersonName("一天");
        item5.setPersonPictureResource(R.drawable.marjorie_ellis);
        item5.setListItems(prepareCommentsArray());
        dataset.add(item5);

        CardData item4 = new CardData();
        item4.setMainBackgroundResource(R.drawable.city_scape);
        item4.setHeadBackgroundResource(R.drawable.city_scape_head);
        item4.setHeadTitle("City Scape");
        item4.setPersonMessage("Solems manducare, tanquam neuter verpa.");
        item4.setPersonName("Mattew Jordan");
        item4.setPersonPictureResource(R.drawable.mattew_jordan);
        item4.setListItems(prepareCommentsArray());
        dataset.add(item4);

        CardData item3 = new CardData();
        item3.setMainBackgroundResource(R.drawable.cuisine);
        item3.setHeadBackgroundResource(R.drawable.cuisine_head);
        item3.setHeadTitle("Cuisine");
        item3.setPersonMessage("Magnum lacteas ducunt ad orexis.");
        item3.setPersonName("Ross Rodriguez");
        item3.setPersonPictureResource(R.drawable.ross_rodriguez);
        item3.setListItems(prepareCommentsArray());
        dataset.add(item3);

        CardData item2 = new CardData();
        item2.setMainBackgroundResource(R.drawable.nature);
        item2.setHeadBackgroundResource(R.drawable.nature_head);
        item2.setHeadTitle("Nature");
        item2.setPersonName("Tina Caldwell");
        item2.setPersonMessage("Nunquam perdere clabulare.");
        item2.setListItems(prepareCommentsArray());
        item2.setPersonPictureResource(R.drawable.tina_caldwell);
        dataset.add(item2);

        CardData item1 = new CardData();
        item1.setMainBackgroundResource(R.drawable.night_life);
        item1.setHeadBackgroundResource(R.drawable.night_life_head);
        item1.setHeadTitle("Night Life");
        item1.setPersonMessage("Cur adelphis studere?");
        item1.setPersonName("Wallace Sutton");
        item1.setPersonPictureResource(R.drawable.wallace_sutton);
        item1.setListItems(prepareCommentsArray());
        dataset.add(item1);

        CardData item6 = new CardData();
        item6.setMainBackgroundResource(R.drawable.night_life);
        item6.setHeadBackgroundResource(R.drawable.night_life_head);
        item6.setHeadTitle("Night Life");
        item6.setPersonMessage("Cur adelphis studere?");
        item6.setPersonName("Wallace Sutton");
        item6.setPersonPictureResource(R.drawable.wallace_sutton);
        item6.setListItems(prepareCommentsArray());
        dataset.add(item6);

    }

    public List<ECCardData> getDataset() {
//        Collections.shuffle(dataset);
        return dataset;
    }

    private List<Article> prepareCommentsArray() {
        Random random = new Random();
        List<Article> articles = new ArrayList<>();
        articles.addAll(Arrays.asList(
                new Article(R.drawable.aaron_bradley,
                        " ",
                                "一 \n" +
                                "杨狗蛋羡慕我和孙小尊。\n" +
                                "我和孙小尊眼看就要结婚了。当初上大学，我们以为两个省份的距离迟早会被大山或者大河给清算得明明白白，连买票坐火车看望对方的心思都不会再有。后我来我发现，人和人相处靠的不是喜欢，是习惯。\n" +
                                "我生病，孙小尊提着水果拿着药送到我宿舍楼下，她去电视台实习，我能自告奋勇帮她完成每一期栏目策划。这就是习惯。两个人不再因为饭桌上人们的言语而生出杂念，不再老是惦记着彼此跟异性通话到底说了什么，她说这就是习惯，一时半会儿改不了。\n" +
                                "至今，我和孙小尊没有在一起租住过。我们见面的时间大部分在各自城市的宾馆。那些宾馆在脑海里如同小时候怎么也集不齐的水浒卡，数量越来越多，单张重复最多的能有二十多枚，我跟太多的陌生人换卡，我偶尔攒钱买一整箱小当家干脆面抽卡，可我从来没敢和别人玩翻洋牌，我担心输掉任何一张，都会影响我凑满整套的进度。孙小尊在一个热得不想吃饭的中午打来电话，说她家里愿意拿出一些钱来买房。我立马打起精神，叫了份外卖，葱爆羊肉盖饭。孙小尊不知道，当时我那种高兴，绝对是拿到宋江卡时的高兴，两次高兴中间，有二十年时光，第一次那年，我九岁。\n" +
                                "房子在大学城，一百多平米。孙小尊拿着钥匙，在粗糙的水泥墙跟前盘算着冰箱彩电洗衣机怎么摆放，声音在空荡荡的毛坯客厅里像是出租车里听到的电台主播，让我充满动力，对明天和明天往后就能过上想要的日子深信不疑。我在毛坯阳台朝着学校的方向望去，哈佛红的办公楼正好挡住了同样是哈佛红的11号楼，11号楼是孙小尊上大学住过的宿舍楼，楼管是个毫不留情面的操着南方口音的阿姨，我跟阿姨吵过好几次架，也变得熟悉起来。毕业那天，我们把不用的毡子和马扎留给阿姨，她笑着说不出话来，帮孙小尊把行李搬到了楼下。孙小尊热得脑门发汗，喘着气，朝我喊着，快，快。我也朝她喊，着啥急，肯定能去。几个小时后，她接到了去电视台实习的通知。\n" +
                                "算来算去，五年时间都是被孙小尊喊过的快字用完的，然后她还补充一句，那又怎样。我们从毛坯房子里出来，碰到了当年在大学城修自行车的许师傅。许师傅在学校德高望重，很多老师也讲过，老许每次补胎，能从浸湿轮胎的水里看见一件事情的另一个结局，至少是另一个走向。孙小尊也听说过，她不认为这是真的。我跟许师傅简单寒暄几句，许师傅接话的时候重重地点头，但我从他的表情看出来，他已经不记得我是谁了。我找他修过三十多次自行车。\n" +
                                "大学城的马路依旧属于二十来岁的青年男女，勾肩搭背的情侣在我和孙小尊身旁匆匆经过，那一阶段的烦恼不是真烦恼，不用像我现在这样，会被单位里的几件小事弄得彻夜不眠。孙小尊跟我分享着她的大学舍友的观念，不打算结婚，不打算建立家庭，更不愿意拥有孩子。孙小尊一边说，一边评判，这样的生活有意义吗？后知后觉的我，才想清楚，这不是评判，这是质疑。我和孙小尊好不容易就要穿上西装和婚纱了，我明白她打心底是向往今后的一切的，我在父亲去世五年后开始慢慢地不为疾病和灾难忐忑不安。我说，夫妻这样的称呼过时了，一个人一辈子更需要的是伙伴，异性的。孙小尊说，那你看咱这伙伴关系合作个啥？我说，那得等房子装修起来再谈，合作不得有个固定的地方？\n" +
                                "孙小尊的父亲多次嘱咐我，对他的女儿好点。电视剧台词终于在我耳边响起，我一直有个非主流想法，说这话的家长，一定是自己亏欠了孩子，没让孩子在建立家庭前获得快乐，这样的快乐不限于一件事或者一个时间段。我问孙小尊，你说下一代人会像我们这样奔波忙碌吗？孙小尊说，实话，我还真没考虑过要孩子的事，就看见别人家的孩子会感到一种亲切。\n" +
                                "我们找了一家米线店吃午饭。孙小尊说，上学的时候吃米线，纯粹是对付一下，一进食堂看见那么多人顿时食欲大减，实在不想跟别人挤在一处打饭，学生服务中心的小吃买了打包回宿舍，吃得快，也吃得自在，现在上班了，吃一份米线，是踏踏实实地吃，一口汤都不剩。我说，我没这么深刻的感受，我只想到，上学吃的饭都不值，从质和量两方面来看，都不值。孙小尊饭量明显越来越大，庆幸的是，身材丝毫不变，考虑到这一点，我笑了出来。孙小尊问我，笑什么。我说，想起个有趣的段子，等你吃完了给你讲。我让老板加了杯本地产的汽水，继续跟孙小尊聊着漫无边际的事情，脑子里偶尔会闪现筹备婚礼的细节，床单的尺寸，家具的配置，议事餐叙叫哪些亲朋好友，摄像师傅用外地的还是本地的，婚礼主持找同学帮忙还是联系婚庆公司，接亲的车辆走什么样的路线，都得安排得明明白白，不能让母亲她老人家一个人张罗。孙小尊也要了一瓶汽水，慢悠悠地喝完。结账的时候，店里已经没其他人了，老板收拾着客人们的餐具，哼着一首熟悉的却又不记得是什么名字的流行歌。\n" +
                                " \n" +
                                "二\n" +
                                "十六天后就是我大喜的日子了。两天前我搬出了与刘三杰合租的房子。刘三杰在银行上班，是我众多同学里读书最多的那个，他的梦想是当一名作家。我从来没见刘三杰写过什么文章，只是听其他同学说过，刘三杰在一家网站上连载了六十多万字的小说，没用自己的名字。我由衷地佩服刘三杰。问过他，他不说是什么网站，半天了支支吾吾蹦出来一句话，六十万字对于网络小说来讲，连个开头也不算。我本来就不怎么看书，索性没多问。刘三杰说，五年前认识的化学系学妹又联系上了。我说，那你赶紧行动啊，五年了，跟化学系的来个化学反应。他说，再说吧，化学反应也未必是化合反应，万一到最后是分解反应呢。五年前，刘三杰和学妹多日夜不归宿，成为了中文系和化学系的公共话题。坊间传闻，毕业典礼结束后，刘三杰带着学妹在许师傅那里看浸湿轮胎的水，想瞧瞧两个人往后几年的样子，看着看着掉进去了，很可能出不来了。我当时寻思，刘三杰这下闯祸了，学妹会不会这辈子都毕不了业了，许师傅有没有办法把他们弄回来。大概一星期过去后，人们才知道，学妹请假回家了，没告诉舍友。刘三杰也没闲着，到省城找了个私人医院做了个不好意思说出来的小手术，等过几天拆了线再回学校打包行李。半个月后，我和刘三杰出现在学校周边的找工作队伍中，经常在面试环节碰到相同的面孔，有的多达十几次，还互相留了微信。刘三杰中途变卦，谋划着以大学毕业生的身份当兵去，征得了父母的同意，老家和学校两头跑，期间又做了个手术，近视眼不近视了，跟学妹接吻的时候再也不用怕眼镜影响了体验。后来学妹一个人到了云南，说是那里有个姐姐开了家店，去了一边打零工挣个钱，一边准备等机会考编制。然后就没有然后了。刘三杰怎么也联系不到学妹，入伍体检也耽搁了。冬天的时候，刘三杰考进了银行，一转眼就是五年。我们租了大学城附近村民的屋子，住了两年，换到了现在租的地方，离刘三杰工作的银行走路不到五分钟就能过去。\n" +
                                "夜里，孙小尊躺在床上说，毛坯房子的轮廓一直在眼前忽闪忽闪的。我说，快睡吧，明天咱就交钱装修。宾馆的大床睡上去总让我心虚，感觉房间里的桌子椅子柜子一个个默不作声地盯着我，看我和孙小尊说了啥，看我和孙小尊换着姿势使整张床发出匀速的声响。 孙小尊翻了翻身，已经睡熟，我把手从她的腰间收回来，望着头顶模糊可见的吊灯，决定新房子用吸顶灯。我又看了看背对我的孙小尊，隐约听见刘三杰在跟我说话。快半夜十二点了，哪有什么刘三杰。\n" +
                                "我定了定神，清澈见底的水已经洗过两条自行车轮胎。许师傅说，刘三杰帮你把午饭捎回宿舍了。来修自行车的是两个外校男生，看他们的脸型，也能猜出来不是本校的，二人肤色偏黑，穿着打扮也不是我们学校的普遍风格，交了许师傅修车钱，骑上自行车并排着从学校东门走了。我问许师傅，你说五年后真的是那样吗？许师傅打了个闷哼，啥五年后？我说，老许大爷，你就别弯弯绕了，我出个前后内外胎都换的钱，你给我好好讲讲。许师傅说，你站这儿一中午不吭气，现在又发什么神经？他三两下收了工具，跨上电动车，往学校西区赶去。\n" +
                                "这已是十一月，雪在眼前的所有建筑上按兵不动，但我依然觉得带给我寒冷的不是风，而是雪。我和刘三杰毕业后又返回学校租了支教学生的床位，将近半年，我们没能找到一份满意的工作，或者说，应聘过的所有单位，没有一个对我们满意。看见那些同时走出校门的人，陆陆续续谋到了正式的岗位，我和刘三杰的心情是一样的。我走回宿舍，刘三杰让我先把饭吃了。我刚拿起筷子，他说，杨狗蛋叫我南下。我问刘三杰，做啥去？他说，杨狗蛋和他的研究生导师在南方做出版项目，问我有没有想法一起干。我对刘三杰可能即将找到工作表示祝贺。刘三杰又说，杨狗蛋打算在南方干稳了，把秦美丽也接过去。杨狗蛋和秦美丽是学校的模范情侣，我好几次想象着孙小尊能和秦美丽一样，愿意和我一起打拼。但是孙小尊表面上开放，骨子里却还坚守着父母之命媒妁之言的老一套，她还有两年才毕业，家里已经给相了五六次亲，这回可好，相亲的男方是她的初恋，现在在他们那边的青龙寺工作，当然不是当和尚，是负责寺庙的弱电工程。\n" +
                                "孙小尊在电视台的实习期只有两个月。两个月之后，就被家里人叫回去相亲，到现在为止，我们没有通过一次电话，连一条微信也没有发过。刘三杰以前告诉我，有一本书上说，人和人的感情，有时候真的说没有就没有了，找不到任何理由，相恋多年，说不爱就不爱了。我和孙小尊之间是否也是如此，一时竟想不清楚。\n" +
                                "我拎着垃圾走出宿舍，告诉刘三杰出门买点东西，刘三杰似乎没听到我说了啥，只是下意识地抬了抬头。学校外不到四百米的地方，已经有附近的村民摆好了烧夜纸的各样用品。我从钱包里取出来三十块钱，递给看摊子的大婶，让她看着拿，不要太复杂就行。大婶装好东西，感叹了一句，哎，年纪轻轻，就没有了父亲。我说，年纪还小，但能想明白，我有几个同学，读小学的时候，就过上了单亲生活。大婶没再接茬，继续给别人选东西。我临走时跟大婶说，您抽空弄个收款码，以后做买卖方便。大婶表示赞同。父亲去世后，母亲说过，现在感受不到，以后可要想他呢。她在说我。奇怪的是，我越来越觉得父亲是一个从来没有出现过的人，仿佛是我和母亲二人凭空杜撰的一个形象。我只记得父亲说过，当兵的时候，每次穿好军装，就像即将经历一场盛大的仪式，战友们一个个昂首阔步，训练场的地面被震得响亮，仿佛是来自大地的掌声。他说他和战友们的歌声好比战鼓隆隆，遥远的广袤天空总会传来阵阵回响，大伙儿的脸上满是微笑，如同迎接着远道而来的故乡亲友。再有就是父亲经常在院子唱起当年连长带着他们到烈日下拉练时的鼓劲儿军歌——战友，战友，这亲切的称呼，这崇高的友谊，把我们结成一个钢铁集体，钢铁集体……\n" +
                                "我朝学校返回的时候，盘算着晚上十点到哪个十字路口，不经意看了看手机，发现有个未接来电，是孙小尊的。我拨回去，无人应答。短短十几分钟，我居然没有听见孙小尊的电话，我为她专门设置的来电铃声还没更换，我又确认了一遍，还是那首电视剧插曲，别对我说永远永远永远，永远不是我要的明天。我相信孙小尊对我是依赖的，有一次晚上，我们出去吃米线，也是个下雪天，快回学校的时候，我突然转身，跟她开玩笑说，我不喜欢你了。我从东门进了学校。我以为和往常一样，她会在身后默默地跟着我，等我给她随便做个鬼脸，再挽起我的胳膊朝宿舍楼走去。我回过头，看到她在东门外马路对面的人行路边坐着，地上厚厚的雪好几天了也没融化。我跑到她跟前，她哭了。\n" +
                                " \n" +
                                "三\n" +
                                "天的确开始凉了，街上的人少得让我以为这座城市的人从来不上街。\n" +
                                "看到学校门口的5路公交车，我有种错觉，只要我到学校东门下了车，会是几个月前孙小尊放暑假我送她回家的夏天，行色匆匆的陌生学妹着急过马路，根本不知道自己踩了一脚狗屎。孙小尊订了晚上7点2671次列车的票。这趟列车带我见过她两次夏天的模样和两次冬天的模样。在火车上度过的八个夜晚，双脚总是莫名其妙地发热，再慢慢变成一种分叉的烦躁不安；跟现在一样，去往火车站的路程被眼前的任何事物阻碍，变长，我没办法决定打出租车还是等公交车，车辆的喇叭声和行人的喧闹声让我心烦意乱，我的每一步都格外吃力。\n" +
                                "我们在学校的最后一顿午餐，让我开始讨厌吃西红柿鸡蛋面。我说了好几遍要去送送小尊，她每次只回我两个字：不用。我像是连续嚼到坏了的瓜子，一颗颗，不知道什么时候能吃个好的。她还有两年毕业。对我来说，两年的意义是每一顿饭必不可少的盐，少放多放总会有吃完重买的一天。她拎着行李箱去火车站，一路上，她在微信里只跟我说了一句话：我是不是忘记带什么东西了，可我想不起来。小尊在火车站外的长椅坐了半个多小时。我看见她的时候，她立马转身朝候车室往回走。我喊了一声，孙小尊，你站住！打陀螺的老大爷把鞭子抽得响亮。我把充电器递给小尊，她没说话，继续朝候车室走。这样的情景让我回忆起母亲先前毫无征兆的南下。一连三四天打不通母亲的电话，我问邻居，问舅舅，都说没见着。周末的晚上，一个陌生的广东号码打来，我接起电话，听到了母亲的声音。母亲说，山西挣不到钱，实在是没办法了，要是有办法，我也舍不得把你一个人留在家里，没几天你就念完大学了，我不出来打工挣钱，谁给你攒结婚的钱。我试图记起从绿色大铁皮门外面一眼就能望见母亲站在院子里等我的情景，但是根本看不到母亲的身影。母亲又说，手机快没电了，等我充上电给你发微信。\n" +
                                "我跟小尊说，西安的天气总比太原的好，哪怕是下雨，也是通情达理的雨，我待在屋子里的时候，它就下个没完没了，我一出门，它就给足面子，拖家带口地去了别的地方，有可能去了咸阳，或者阎良。\n" +
                                "小尊说，我朋友帮我在西安找了一家报社，我怕挣不到钱，在你们的省台实习的时候，我就想着将来总有天我会彻底和我的专业划清界限。\n" +
                                "东门外的共享单车越来越多。我不知道人们骑着它们去了哪里，我无缘无故地担心起它们中大多数，会在我需要的时候电量不足，正好是我骑着它们中的一辆赶那趟2671次列车，我恨自己不能早一些到达东门，但是我从未想过直接奔向火车站。我终于发现我有一个执念，不站在东门，就不能去火车站。\n" +
                                "九月的一个周末，我去看过小尊一次，她还是老样子，拖延症重了，说的比做的好，哪句真哪句假根本分不清，我只好没话找话，聊聊与大学时代的人和事有关的话题。她脱衣服和穿衣的动作还是那么快。八月的时候，她出了个小车祸，摩托车的排气管把她的腿烫伤了，一块一块的铁青，像是画上去的。她在电话里哭了五分钟，我一句安慰的话也没有，只是告诉她，以后出门小心。我专门瞅了瞅她的腿，铁青没了。她明白我的意思，冲我喊道，看什么，没见过？已经好了！她还补充了一点，我们之间只能在工作上存在交集，要是不小心想到肉体上了，就想想她冬天穿得还很厚的样子。第二天一大早，她说她家里安排她跟一个在税务局做设备维修的男的相亲，晚上回来得迟，让我自己出去吃饭。下午三点多，我一个人走在西安的万达广场，每次来都是如此，以至于不记得来过几次，也不记得哪一次是天冷的时候，哪一次是天热的时候。我的母亲就是在天热的时候摔断了脚踝，是伏天的清晨，可阳光的温度已经让我不愿意接受这样的事情。小尊问我，你母亲没打算再找老伴吗？另一个让我恨意骤生的问题是：你说你为什么不好好考一个正式的工作呢？\n" +
                                "东门外的世界越来越遥不可及，那些灯红酒绿遮不住的大排档木炭烟味早已很难轻而易举地漫过学校的金属栅栏。扭头看一眼在学校东区操场的人工草皮坐着的情侣和跑道上锻炼的人，门墙上学校的名字，突然显得巨大而陌生，偶尔被门卫大叔拦下的车辆从驾驶员位置伸出来个脑袋，急急忙忙地沟通一番，也未必能等来放行杆的升起。东门对面打算返校的人，大部分整整齐齐地，能够左顾右盼地留意一下来往车辆的速度，我从马路中间的隔离栏望去，那种瞬时的等待也显得无奈和漫长。共享单车一辆一辆地被人们骑走，停车区变空，自行车白色图标在地面逐渐立体感十足，准备狠下心来跑出矩形的白框，可又不愿意看着轮胎碾过白框。行人的说笑和脚步声一次又一次打断了它的想法 ，白框更加坚固了，像是在执著地等待着人们把骑出去的单车给早早还回来。好几家快递公司的派件员在旁边停下来，打完所有的收件电话，席地而坐，侃大山，聊那些取快递的女学生的穿着和身高，要么打听别家公司最近有啥员工福利，没过多久，快递员陆续离开，他们中的大多数，都曾告诉我，羡慕念大学的生活，而我只能想到他们日复一日地往复和几成贯口的通话内容，他们的每一次到来和离去，让我想起每一次下定决心要去做的事，最后往往烂尾，耿耿于怀，悔不当初。\n" +
                                "黄昏，太阳开始落山，我找好了烧夜纸的十字路口。刘三杰发微信说已经坐上了火车，南下投奔杨狗蛋。那一刻，我想起属于毕业季的七月，我想象着往后的日子再不会踏进东门；就像现在，这样寒冷的天气，我更加找不出进去的意义；两年前的这个季节，我最想看到小尊能出现在我父亲的葬礼上；小尊发来一条短信，冰冷的手机屏幕，大概也是地上的雪的温度。老家院子里，门框上的漆早就由天蓝色渐变成暗黑色。朝门内望去，屋子里的人很多，来来回回，有的很熟悉，有的只见过几次面，他们表情僵滞，个个心事重重的样子，有时候朝门外看一眼。锣鼓响起的时候，偶尔被断断续续的哭声打断。快到中午的半个钟头间，锣鼓声动静大了些。我好像看见许多彩色的气球，又像是正月里高高挂起的灯笼；父亲拿着几只，挨个往高处挂，周围的人有说有笑，讨论着一些似有似无的事情；不知怎的，那些气球飘到了院门外的河道，父亲望着它们，像是等着什么；我赶紧卷起裤管跑进河道一个一个往回捡，我以为我都把它们捡回来了，冲着父亲高兴地喊着，跑着，但那些气球已经在河道中化成一束束光；后来，整条河开始向远处移动。我早已不记得小尊那条短信的内容。\n",
                        "责任编辑：梅不谈")));
//                new Article(R.drawable.barry_allen, "Barry Allen", "It is a cold powerdrain, sir.", "jun 1, 2015"),
//                new Article(R.drawable.bella_holmes, "Bella Holmes", "Particle of a calm shield, control the alignment!", "sep 21, 1937"),
//                new Article(R.drawable.caroline_shaw, "Caroline Shaw", "The human kahless quickly promises the phenomenan.", "may 23, 1967"),
//                new Article(R.drawable.connor_graham, "Connor Graham", "Ionic cannon at the infinity room was the sensor of voyage, imitated to a dead pathway.", "sep 1, 1972"),
//                new Article(R.drawable.deann_hunt, "Deann Hunt", "Vital particles, to the port.", "aug 13, 1995"),
//                new Article(R.drawable.ella_cole, "Ella Cole", "Stars fly with hypnosis at the boldly infinity room!", "nov 18, 1952"),
//                new Article(R.drawable.jayden_shaw, "Jayden Shaw", "Hypnosis, definition, and powerdrain.", "apr 1, 2013"),
//                new Article(R.drawable.jerry_carrol, "Jerry Carrol", "When the queen experiments for nowhere, all particles control reliable, cold captains.", "nov 14, 1964"),
//                new Article(R.drawable.lena_lucas, "Lena Lukas", "When the c-beam experiments for astral city, all cosmonauts acquire remarkable, virtual lieutenant commanders.", "may 4, 1965"),
//                new Article(R.drawable.leonrd_kim, "Leonard Kim", "Starships walk with love at the cold parallel universe!", "jul 3, 1974"),
//                new Article(R.drawable.marc_baker, "Mark Baker", "Friendship at the bridge that is when quirky green people yell.", "dec 24, 1989")));
        Collections.shuffle(articles);
//        return articles.subList(0, 6 + random.nextInt(5));
        return articles;
    }
}
