# Cigarette Assessment App 

たばこの乗り換えを検討中の方に向けて、10個の質問に答えるだけで次のたばこを偏見で提案してくれる「タバコ診断アプリケーション」です。

# デモ (イメージ)
- Q1〜Q10までのステップ形式アンケート
- 回答状況を示すプログレスバー機能
- スコアリングアルゴリズムによる最終判定

#　機能・特徴

-ウィザード形式UI:複数の質問を各ページ一問ずつ回答できるようにし、回答進行を促す。
-セッション管理:@SessionAttributes を活用し、複数画面にまたがる回答データをサーバーサイドで保持。
-スコアリング: 各回答に応じて特定の銘柄に重み付け、最もスコアの高い銘柄を抽出。
-プログレスバー:進捗状況を各質問ページに表示し、ユーザーの離脱を防止。

#　技術スタック

*   **Backend**: Java 17+, Spring Boot 3.x
*   **Framework**: Spring MVC
*   **Template Engine**: Thymeleaf
*   **Tooling**: Lombok, Spring Web
*   **Build Tool**: Maven / Gradle

#　プロジェクト構成

src/main/java/com/example/cigarette - CigaretteApplication.java
　　　　　　　　　　　　　　　　    　 - controller -CigaretteController.java
                                    - model -AssessmentForm.java
                                    - service -CigaretteService.java
                          /resources- templates -q1.html ~ q10.html
                                                -ResultRecommendApp.html
