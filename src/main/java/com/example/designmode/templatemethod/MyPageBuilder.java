package com.example.designmode.templatemethod;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-04-05 15:42
 **/

public class MyPageBuilder extends AbstractPageBuilder {
    @Override
    protected void appendMeta(StringBuffer stringBuffer) {
        stringBuffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");
    }

    @Override
    protected void appendTitle(StringBuffer stringBuffer) {
        stringBuffer.append("<title>你好</title>");
    }

    @Override
    protected void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body>你好，世界！</body>");
    }

    public static void main(String[] args) {
        PageBuilder pageBuilder = new MyPageBuilder();
        System.out.println(pageBuilder.buildHtml());
    }


}
