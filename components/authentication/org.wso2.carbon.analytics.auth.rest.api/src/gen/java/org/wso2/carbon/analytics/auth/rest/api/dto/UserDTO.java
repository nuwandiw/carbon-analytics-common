package org.wso2.carbon.analytics.auth.rest.api.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UserDTO.
 */
public class UserDTO {
    @JsonProperty("authUser")
    private String authUser = null;

    @JsonProperty("partialAccessToken")
    private String partialAccessToken = null;

    @JsonProperty("partialRefreshToken")
    private String partialRefreshToken = null;

    public UserDTO authUser(String authUser) {
        this.authUser = authUser;
        return this;
    }

    /**
     * Get authUser.
     *
     * @return authUser
     **/
    @ApiModelProperty(value = "")
    public String getAuthUser() {
        return authUser;
    }

    public void setAuthUser(String authUser) {
        this.authUser = authUser;
    }

    public UserDTO partialAccessToken(String partialAccessToken) {
        this.partialAccessToken = partialAccessToken;
        return this;
    }

    /**
     * Get partialAccessToken.
     *
     * @return partialAccessToken
     **/
    @ApiModelProperty(value = "")
    public String getPartialAccessToken() {
        return partialAccessToken;
    }

    public void setPartialAccessToken(String partialAccessToken) {
        this.partialAccessToken = partialAccessToken;
    }

    public UserDTO partialRefreshToken(String partialRefreshToken) {
        this.partialRefreshToken = partialRefreshToken;
        return this;
    }

    /**
     * Get partialRefreshToken.
     *
     * @return partialRefreshToken
     **/
    @ApiModelProperty(value = "")
    public String getPartialRefreshToken() {
        return partialRefreshToken;
    }

    public void setPartialRefreshToken(String partialRefreshToken) {
        this.partialRefreshToken = partialRefreshToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDTO user = (UserDTO) o;
        return Objects.equals(this.authUser, user.authUser) &&
                Objects.equals(this.partialAccessToken, user.partialAccessToken) &&
                Objects.equals(this.partialRefreshToken, user.partialRefreshToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authUser, partialAccessToken, partialRefreshToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDTO {\n");

        sb.append("    authUser: ").append(toIndentedString(authUser)).append("\n");
        sb.append("    partialAccessToken: ").append(toIndentedString(partialAccessToken)).append("\n");
        sb.append("    partialRefreshToken: ").append(toIndentedString(partialRefreshToken)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

