import javassist.*;

import java.io.IOException;

public class HookUtil {

    public static void main(String[] args) {

        ClassPool pool = ClassPool.getDefault();
        try {
            // 修改Version
            pool.insertClassPath("build/charles.jar");
            CtClass cc1 = pool.get("com.xk72.charles.CharlesContext");
            CtMethod method = cc1.getDeclaredMethod("getVersionName");
            method.insertBefore("{if(true) return \"Test\";}");
            cc1.writeFile();


            // 绕过 License 验证
            CtClass cc2 = pool.get("com.xk72.charles.YQUd");
            CtMethod[] tEdg_methods = cc2.getDeclaredMethods("tEdg");
            for (CtMethod m : tEdg_methods) {
                if (m.getParameterTypes().length == 0 && m.getReturnType() == CtClass.booleanType) {
                    System.out.println(m.toString());
                    m.insertBefore("{if(true) return true;}");
                }

                if (m.getParameterTypes().length == 2 && m.getReturnType().getName().equalsIgnoreCase("java.lang.String")) {
                    System.out.println(m.toString());
                    m.insertBefore("{if(true) return null;}");
                }
            }
            CtMethod[] TryJ_methods = cc2.getDeclaredMethods("TryJ");
            for (CtMethod m : TryJ_methods) {
                if (m.getParameterTypes().length == 0 && m.getReturnType() == CtClass.voidType) {
                    System.out.println(m.toString());
                    m.setBody("{return;}");
                }

            }
            CtMethod[] NCuT_methods = cc2.getDeclaredMethods("NCuT");
            for (CtMethod m : NCuT_methods) {
                if (m.getParameterTypes().length == 0 && m.getReturnType().getName().equalsIgnoreCase("java.lang.String")) {
                    System.out.println(m.toString());
                    m.insertBefore("{if(true) return \"Anything OK? - Site License\";}");
                }

            }
            cc2.writeFile();


            // 修改 Access Setting
            CtClass ct_CharlesFrame = pool.get("com.xk72.charles.gui.CharlesFrame");
            CtClass ct_CharlesContext = pool.get("com.xk72.charles.CharlesContext");
            CtConstructor constructor3 = ct_CharlesFrame.getDeclaredConstructor(new CtClass[]{ct_CharlesContext});
            constructor3.insertAfter("this.accessControlSettingsAction = new com.xk72.charles.gui.CharlesFrame$29(this, \"Test Settings...\");");
            //写入保存
            ct_CharlesFrame.setModifiers(Modifier.PUBLIC);
            ct_CharlesFrame.writeFile();

        } catch (NotFoundException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
