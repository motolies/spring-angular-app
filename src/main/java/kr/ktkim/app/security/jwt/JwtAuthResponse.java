package kr.ktkim.app.security.jwt;

import kr.ktkim.app.model.BaseModel;

/**
 * @author Keumtae Kim
 */
public class JwtAuthResponse extends BaseModel {

    private static final long serialVersionUID = 1250166508152483573L;

    private final String token;

    public JwtAuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
