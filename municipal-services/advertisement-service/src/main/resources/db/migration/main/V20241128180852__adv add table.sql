CREATE TABLE eg_adv_payment_timer (
  id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  booking_id CHARACTER VARYING(64) NOT NULL UNIQUE,
  createdBy CHARACTER VARYING(64) NOT NULL,
  createdTime BIGINT NOT NULL,
  lastModifiedBy CHARACTER VARYING(64),
  lastModifiedTime BIGINT
);
