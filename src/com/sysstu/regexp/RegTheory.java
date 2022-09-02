package com.sysstu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 师羊生
 * @version 1.0
 * 正则底层实现
 */
public class RegTheory {
    public static void main(String[] args) {

//        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版本：" +
//                "J2ME（Java2 Micro Edition，Java2平台的微型版），应用于移动、无线及有限资源的环境；J2SE（Java 2 Standard Edition，" +
//                "Java 2平台的标准版），应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2平台的企业版），应用3443于基于Java的应用服务器。" +
//                "Java 2平台的发布，是Java发展过程中最重要的一个里程碑，标志着Java的应用开始普及9889。";

        String content = "haner erhaner rtvfhan han";

        // 1. \\d表示一个任意的数字
        //String regStr = "\\d\\d\\d\\d";
        //String regStr = "[^a-z]{2}";
        //String regStr = "^[0-9]\\-[a-z]+$";
        String regStr = "han\\B";

        Pattern pattern = Pattern.compile(regStr);
        //就是matcher 匹配器按照 pattern（模式、样式），到content文本中去匹配，找到就返回true，否则返回false
        Matcher matcher = pattern.matcher(content);
        Pattern.matches(regStr, content);
        /**
         * matcher.find() 完成的任务
         * 1. 根据指定的规则，定位满足规则的子字符串
         * 2.找到后，将子字符串的开始的索引记录到matcher对象的属性int[] groups
         *      groups[0] = 0 ,把该子字符串的介绍的索引+1的值记录到 groups[1] = 4
         * 3. 同事记录oldLast 的值为  子字符串的介绍的索引+1的值 即4， 即下次执行find时，就从4开始匹配
         *
         * matcher.group(0)
         */
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
