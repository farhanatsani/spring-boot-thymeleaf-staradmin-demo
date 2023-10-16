create table user_sample
(
    id                bigint unsigned auto_increment comment 'ID' primary key,
    family_name       varchar(255)                               not null comment '姓',
    first_name        varchar(255)                               not null comment '名',
    family_kana_name  varchar(255)                               not null comment '姓カナ',
    first_kana_name   varchar(255)                               not null comment '姓カナ',
    birthday          date                                       not null comment '生年月日',
    gender            enum ('man', 'woman')                      null comment '性別',
    office            varchar(255)                               not null comment '会社・組織名',
    tel               varchar(20)                                not null comment '電話番号',
    mail              varchar(255)                               not null comment 'メールアドレス',
    is_quit           tinyint unsigned default '0'               not null comment '退会済み',
    created_at        datetime         default CURRENT_TIMESTAMP null comment '作成日付',
    updated_at        datetime         default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '更新日付'
);
