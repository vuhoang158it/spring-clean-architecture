//package com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.customer.model;
//
//import com.aggregatoricapaci.acx.loyalty_clean_architecture.domain.shared.BaseEntity;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Table;
//import lombok.*;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "user", schema = "loyalty")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Customer extends BaseEntity {
//    @Column(name = "username")
//    private String username;
//
//    @Column(name = "password")
//    private String password;
//
//    @Column(name = "salt")
//    private String salt;
//
//    @Column(name = "is_active")
//    private String isActive;
//
//    @Column(name = "email")
//    private String email;
//
//    @Column(name = "password_requested_at")
//    private LocalDateTime passwordRequestedAt;
//
//    @Column(name = "confirmation_token")
//    private String confirmationToken;
//
//    @Column(name = "deleted_at")
//    private LocalDateTime deletedAt;
//
//    @Column(name = "last_login_at")
//    private LocalDateTime lastLoginAt;
//    @Column(name = "dtype")
//
//    private String dtype;
//
//    @Column(name = "first_name")
//    private String firstName;
//
//    @Column(name = "last_name")
//    private String lastName;
//    @Column(name = "phone")
//
//    private String phone;
//    @Column(name = "external")
//
//    private String external;
//
//    @Column(name = "api_key")
//    private String apiKey;
//
//    @Column(name = "temporary_password_set_at")
//    private LocalDateTime temporaryPasswordSetAt;
//
//    @Column(name = "action_token")
//    private String actionToken;
//
//    @Column(name = "referral_customer_email")
//    private String referralCustomerEmail;
//
//    @Column(name = "newsletter_used_flag")
//    private String newsletterUsedFlag;
//
//    @Column(name = "status_type")
//    private String statusType;
//
//    @Column(name = "status_state")
//    private String statusState;
//
//    @Column(name = "allow_point_transfer")
//    private String allowPointTransfer;
//}
