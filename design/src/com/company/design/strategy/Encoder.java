package com.company.design.strategy;
// 전략(AppendStrategy, Base64Strategy, NormalStrategy)에 따른 결과가 달라지는 인코더 생성
public class Encoder  {
    private EncodingStrategy encodingStrategy;

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);

    }
    // 전략 셋팅용 메서드
    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}
