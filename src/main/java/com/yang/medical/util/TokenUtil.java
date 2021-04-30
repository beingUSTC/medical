//package com.yang.medical.util;
//
//import com.auth0.jwt.JWT;
//import com.auth0.jwt.JWTVerifier;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.interfaces.DecodedJWT;
//import com.yang.medical.entity.User;
//
///**
// * 工具类用于token操作
// * 2021-4-17
// * yzy
// */
//public class TokenUtil {
//
////    private static final long EXPIRE_TIME= 15*60*1000;
//private static final String TOKEN_SECRET="TOKEN_SECRET";
//
//    public static String sign(User user){
//        String token = null;
//        try{
//            token = JWT.create()
//                    .withIssuer("auth0")
//                    .withClaim("rid", user.getID())
//                    // 使用了HMAC256加密算法。
//                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return token;
//    }
//
//    public static boolean verify(String token) {
//        try {
//            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth0").build();
//            DecodedJWT jwt = verifier.verify(token);
//            System.out.println("认证通过：");
//            System.out.println("rid: " + jwt.getClaim("rid").asString());
//            return true;
//        } catch (Exception e){
//            return false;
//        }
//    }
//}
