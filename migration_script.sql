-- ----------------------------------------------------------------------------
-- MySQL Workbench Migration
-- Migrated Schemata: YixunCcmz
-- Source Schemata: YixunCcmz
-- Created: Thu Apr 26 09:21:03 2018
-- Workbench Version: 6.3.10
-- ----------------------------------------------------------------------------

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------------------------------------------------------
-- Schema YixunCcmz
-- ----------------------------------------------------------------------------
DROP SCHEMA IF EXISTS `YixunCcmz` ;
CREATE SCHEMA IF NOT EXISTS `YixunCcmz` ;

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_FamilyMember1
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_FamilyMember1` (
  `Sfzh` VARCHAR(20) NOT NULL,
  `Jtbh` VARCHAR(20) NULL,
  `Ry_Code` VARCHAR(20) NULL,
  `Yhzgx` VARCHAR(50) NULL,
  `Name` VARCHAR(50) NULL,
  `HyZk` VARCHAR(50) NULL,
  `Sex` VARCHAR(4) NULL,
  `Birth` DATETIME(6) NULL,
  `HkXz` VARCHAR(30) NULL,
  `HkLx` VARCHAR(30) NULL,
  `HjAddress` VARCHAR(100) NULL,
  `BxQk` VARCHAR(4) NULL,
  `JzAddress` VARCHAR(100) NULL,
  `LxTel` VARCHAR(50) NULL,
  `Yb` VARCHAR(50) NULL,
  `SfLb` VARCHAR(50) NULL,
  `YfLx` VARCHAR(30) NULL,
  `Mz` VARCHAR(50) NULL,
  `BxLx` VARCHAR(50) NULL,
  `BxCode` VARCHAR(50) NULL,
  `CbZzMoney` DECIMAL(18,2) NULL,
  `WhCd` VARCHAR(20) NULL,
  `LdNl` VARCHAR(20) NULL,
  `Cj` VARCHAR(4) NULL,
  `CjLx` VARCHAR(20) NULL,
  `CjDj` VARCHAR(4) NULL,
  `Jkqk` VARCHAR(4) NULL,
  `HbCd` VARCHAR(4) NULL,
  `HbLx` VARCHAR(30) NULL,
  `JbMc` VARCHAR(30) NULL,
  `JtLx` VARCHAR(20) NULL,
  `ZpYy` VARCHAR(20) NULL,
  `GzQk` VARCHAR(20) NULL,
  `GzDw` VARCHAR(100) NULL,
  `Tel` VARCHAR(20) NULL,
  `ZyMc` VARCHAR(20) NULL,
  `TdLb` VARCHAR(20) NULL,
  `Llsf` VARCHAR(50) NULL,
  `Sjgqqj` VARCHAR(50) NULL,
  `Zstxsj` DATETIME(6) NULL,
  `Flag` INT NULL DEFAULT 0,
  `jgbm` VARCHAR(500) NULL,
  `Dc_date` DATETIME NULL,
  `Lr_date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `Ry_Zt` VARCHAR(10) NULL DEFAULT '姝ｅ父',
  `Ry_Jtbh` VARCHAR(50) NULL,
  `Hz_Sfzh` VARCHAR(50) NULL,
  `Hz_Name` VARCHAR(50) NULL,
  `Hz_Sex` VARCHAR(50) NULL,
  `old_Sfzh` VARCHAR(20) NULL,
  PRIMARY KEY (`Sfzh`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_Disease
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_Disease` (
  `ID` VARCHAR(64)  NOT NULL,
  `Name` VARCHAR(100) NOT NULL,
  `ShortName` VARCHAR(100) NOT NULL,
  `Is_Deleted` TINYINT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`ID`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_GovermentDept
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_GovermentDept` (
  `FullCode` VARCHAR(100) NOT NULL,
  `Code` VARCHAR(50) NOT NULL,
  `Name` VARCHAR(500) NOT NULL,
  `Level` INT NOT NULL,
  `ParentFullCode` VARCHAR(100) NULL,
  `IsDeleted` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`FullCode`),
  CONSTRAINT `FK_DICT_GOV_REFERENCE_GOV1`
    FOREIGN KEY (`ParentFullCode`)
    REFERENCES `YixunCcmz`.`Dict_GovermentDept` (`FullCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_ReimburseType
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_ReimburseType` (
  `ID` INT NOT NULL,
  `Name` VARCHAR(100) NOT NULL,
  `ShortName` VARCHAR(50) NULL,
  `Memo` VARCHAR(500) NULL,
  PRIMARY KEY (`ID`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.log_MzjzMethod
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`log_MzjzMethod` (
  `ID` BIGINT NOT NULL AUTO_INCREMENT,
  `YB_Info` VARCHAR(8000) NOT NULL,
  `ExceptionMsg` VARCHAR(8000) NOT NULL,
  `CreateTime` DATETIME(6) NOT NULL,
  PRIMARY KEY (`ID`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_ReimbursePolicy
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_ReimbursePolicy` (
  `ID` VARCHAR(64)  NOT NULL,
  `FromDate` DATETIME(6) NOT NULL,
  `EndDate` DATETIME(6) NOT NULL,
  `VOD` DECIMAL(19,4) NOT NULL,
  `ChildrenAge` INT NOT NULL,
  `OutpatientQuota` DECIMAL(19,4) NOT NULL,
  `Memo` VARCHAR(500) NULL,
  PRIMARY KEY (`ID`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_IdentityCategory
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_IdentityCategory` (
  `ID` INT NOT NULL,
  `Code` VARCHAR(50) NULL,
  `Name` VARCHAR(100) NOT NULL,
  `Type` INT NOT NULL,
  PRIMARY KEY (`ID`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_HospitalLevel
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_HospitalLevel` (
  `ID` INT NOT NULL,
  `Name` VARCHAR(500) NOT NULL,
  `Code` VARCHAR(50) NOT NULL,
  `Memo` VARCHAR(500) NULL,
  PRIMARY KEY (`ID`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_SchemaVersions
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_SchemaVersions` (
  `Feature` VARCHAR(128) CHARACTER SET 'utf8mb4' NOT NULL,
  `CompatibleSchemaVersion` VARCHAR(128) CHARACTER SET 'utf8mb4' NOT NULL,
  `IsCurrentVersion` TINYINT(1) NOT NULL,
  PRIMARY KEY (`Feature`, `CompatibleSchemaVersion`));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_Applications
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_Applications` (
  `ApplicationName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `LoweredApplicationName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `ApplicationId` VARCHAR(64)  NOT NULL,
  `Description` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  PRIMARY KEY (`ApplicationId`),
   INDEX `UQ__aspnet_A__3091033101142BA1` (`ApplicationName`(255) ASC),
   INDEX `UQ__aspnet_A__17477DE403F0984C` (`LoweredApplicationName`(255) ASC));

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_Paths
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_Paths` (
  `ApplicationId` VARCHAR(64)  NOT NULL,
  `PathId` VARCHAR(64)  NOT NULL,
  `Path` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `LoweredPath` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  PRIMARY KEY (`PathId`),
  CONSTRAINT `FK_aspnet_Paths_ApplicationId_Applications_ApplicationId`
    FOREIGN KEY (`ApplicationId`)
    REFERENCES `YixunCcmz`.`aspnet_Applications` (`ApplicationId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_Roles
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_Roles` (
  `ApplicationId` VARCHAR(64)  NOT NULL,
  `RoleId` VARCHAR(64)  NOT NULL,
  `RoleName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `LoweredRoleName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `Description` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `Level1` TINYINT(1) NULL DEFAULT 0,
  `Level2` TINYINT(1) NULL DEFAULT 0,
  `Level3` TINYINT(1) NULL DEFAULT 0,
  `Level4` TINYINT(1) NULL DEFAULT 0,
  `Hosiptal_Flag` TINYINT(1) NULL DEFAULT 0,
  PRIMARY KEY (`RoleId`),
  CONSTRAINT `FK_aspnet_Roles_ApplicationId_aspnet_Applications_ApplicationId`
    FOREIGN KEY (`ApplicationId`)
    REFERENCES `YixunCcmz`.`aspnet_Applications` (`ApplicationId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_Hospital
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_Hospital` (
  `ID` VARCHAR(64)  NOT NULL,
  `HospitalLevel_ID` INT NULL,
  `Name` VARCHAR(500) NOT NULL,
  `ShortName` VARCHAR(500) NULL,
  `Code` VARCHAR(50) NULL,
  `ContactName` VARCHAR(500) NULL,
  `Tel` VARCHAR(500) NULL,
  `Address` VARCHAR(500) NULL,
  `Memo` VARCHAR(500) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_DICT_HOS_REFERENCE_DICT_HOS`
    FOREIGN KEY (`HospitalLevel_ID`)
    REFERENCES `YixunCcmz`.`Dict_HospitalLevel` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_IdentityType
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_IdentityType` (
  `ID` INT NOT NULL,
  `CategoryID` INT NULL,
  `Type` INT NOT NULL,
  `Name` VARCHAR(100) NOT NULL,
  `ShortName` VARCHAR(100) NULL,
  `RegType` INT NOT NULL,
  `Memo` VARCHAR(500) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_DICT_IDE_REFERENCE_DICT_IDE`
    FOREIGN KEY (`CategoryID`)
    REFERENCES `YixunCcmz`.`Dict_IdentityCategory` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_FamilyMember1_History
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_FamilyMember1_History` (
  `ID` VARCHAR(64)  NOT NULL,
  `Sfzh` VARCHAR(20) NOT NULL,
  `SfLb` VARCHAR(50) NULL,
  `jgbm` VARCHAR(500) NULL,
  `Ry_Zt` VARCHAR(10) NULL,
  `BeginTime` DATETIME(6) NOT NULL,
  `EndTime` DATETIME(6) NOT NULL,
  `Comment` VARCHAR(1000) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_DICT_FAM_REFERENCE_DICT_FAM`
    FOREIGN KEY (`Sfzh`)
    REFERENCES `YixunCcmz`.`Dict_FamilyMember1` (`Sfzh`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_StdDisease
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_StdDisease` (
  `Code` VARCHAR(50) NOT NULL,
  `Name` VARCHAR(200) NOT NULL,
  `ShortName` VARCHAR(50) NULL,
  `Category` VARCHAR(200) NULL,
  `Memo` VARCHAR(500) NULL,
  `RT_ID` INT NOT NULL,
  PRIMARY KEY (`Code`),
  CONSTRAINT `FK_Dict_StdDisease_Dict_ReimburseType`
    FOREIGN KEY (`RT_ID`)
    REFERENCES `YixunCcmz`.`Dict_ReimburseType` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_ReimbursePolicy_Target
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_ReimbursePolicy_Target` (
  `ID` VARCHAR(64)  NOT NULL,
  `RP_ID` VARCHAR(64)  NOT NULL,
  `IC_ID` INT NOT NULL,
  `MaxQuota` DECIMAL(19,4) NOT NULL,
  `Memo` VARCHAR(500) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_DICT_REI_REFERENCE_DICT_IDE`
    FOREIGN KEY (`IC_ID`)
    REFERENCES `YixunCcmz`.`Dict_IdentityCategory` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_DICT_REI_REFERENCE_DREI`
    FOREIGN KEY (`RP_ID`)
    REFERENCES `YixunCcmz`.`Dict_ReimbursePolicy` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_ReimbursePolicy_Target_Detail
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_ReimbursePolicy_Target_Detail` (
  `ID` VARCHAR(64)  NOT NULL,
  `RT_T_ID` VARCHAR(64)  NOT NULL,
  `RT_ID` INT NOT NULL,
  `QuotaFlag` INT NOT NULL DEFAULT 1,
  `BeginPercent` DECIMAL(7,4) NOT NULL DEFAULT 0,
  `EndPercent` DECIMAL(7,4) NOT NULL DEFAULT 0,
  `SumFloatingMoney` DECIMAL(19,4) NOT NULL,
  `FloatingMoney` DECIMAL(19,4) NOT NULL,
  `ReimbursePercent` DECIMAL(7,4) NOT NULL,
  `ChildFloatingPercent` DECIMAL(7,4) NOT NULL,
  `Memo` VARCHAR(500) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_DICT_REI_REFERENCE_DICT_REI`
    FOREIGN KEY (`RT_ID`)
    REFERENCES `YixunCcmz`.`Dict_ReimburseType` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_DICT_REI_REFERENT_REI`
    FOREIGN KEY (`RT_T_ID`)
    REFERENCES `YixunCcmz`.`Dict_ReimbursePolicy_Target` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.RolePermissions
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`RolePermissions` (
  `ID` VARCHAR(64)  NOT NULL,
  `RoleId` VARCHAR(64)  NOT NULL,
  `PermissionId` VARCHAR(322) CHARACTER SET 'utf8mb4' NOT NULL,
  `RoleName` VARCHAR(128) CHARACTER SET 'utf8mb4' NOT NULL,
  `PermissionName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `PermissionDisplayName` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `Category` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_RolePermissions_aspnet_Roles`
    FOREIGN KEY (`RoleId`)
    REFERENCES `YixunCcmz`.`aspnet_Roles` (`RoleId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_GovDept_Hospital
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_GovDept_Hospital` (
  `ID` VARCHAR(64)  NOT NULL,
  `GovDeptFullCode` VARCHAR(100) NULL,
  `HospitalID` VARCHAR(64)  NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_DICT_GOV_REFERENCE_DICT_GOV`
    FOREIGN KEY (`GovDeptFullCode`)
    REFERENCES `YixunCcmz`.`Dict_GovermentDept` (`FullCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_DICT_GOV_REFERENCE_DICT_HOS`
    FOREIGN KEY (`HospitalID`)
    REFERENCES `YixunCcmz`.`Dict_Hospital` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_Users
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_Users` (
  `ApplicationId` VARCHAR(64)  NOT NULL,
  `UserId` VARCHAR(64)  NOT NULL,
  `UserName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `LoweredUserName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `MobileAlias` VARCHAR(16) CHARACTER SET 'utf8mb4' NULL DEFAULT NULL,
  `IsAnonymous` TINYINT(1) NOT NULL DEFAULT 0,
  `LastActivityDate` DATETIME(6) NOT NULL,
  `GovDeptFullCode` VARCHAR(100) NULL,
  `HospitalID` VARCHAR(64)  NULL,
  `CNName` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  PRIMARY KEY (`UserId`),
  CONSTRAINT `FK_aspnet_Users_ApplicationId_aspnet_Applications_ApplicationId`
    FOREIGN KEY (`ApplicationId`)
    REFERENCES `YixunCcmz`.`aspnet_Applications` (`ApplicationId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_aspnet_Users_Dict_GovermentDept`
    FOREIGN KEY (`GovDeptFullCode`)
    REFERENCES `YixunCcmz`.`Dict_GovermentDept` (`FullCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_aspnet_Users_Dict_Hospital`
    FOREIGN KEY (`HospitalID`)
    REFERENCES `YixunCcmz`.`Dict_Hospital` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_PersonalizationAllUsers
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_PersonalizationAllUsers` (
  `PathId` VARCHAR(64)  NOT NULL,
  `PageSettings` LONGBLOB NOT NULL,
  `LastUpdatedDate` DATETIME(6) NOT NULL,
  PRIMARY KEY (`PathId`),
  CONSTRAINT `FK_aspnet_PersonalizationAllUsers_PathId_aspnet_Paths_PathId`
    FOREIGN KEY (`PathId`)
    REFERENCES `YixunCcmz`.`aspnet_Paths` (`PathId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_PersonalizationPerUser
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_PersonalizationPerUser` (
  `Id` VARCHAR(64)  NOT NULL,
  `PathId` VARCHAR(64)  NULL,
  `UserId` VARCHAR(64)  NULL,
  `PageSettings` LONGBLOB NOT NULL,
  `LastUpdatedDate` DATETIME(6) NOT NULL,
  PRIMARY KEY (`Id`),
  CONSTRAINT `FK_aspnet_PersonalizationPerUser_PathId_aspnet_Paths_PathId`
    FOREIGN KEY (`PathId`)
    REFERENCES `YixunCcmz`.`aspnet_Paths` (`PathId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_aspnet_PersonalizationPerUser_UserId_aspnet_Users_UserId`
    FOREIGN KEY (`UserId`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_Membership
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_Membership` (
  `ApplicationId` VARCHAR(64)  NOT NULL,
  `UserId` VARCHAR(64)  NOT NULL,
  `Password` VARCHAR(128) CHARACTER SET 'utf8mb4' NOT NULL,
  `PasswordFormat` INT NOT NULL DEFAULT 0,
  `PasswordSalt` VARCHAR(128) CHARACTER SET 'utf8mb4' NOT NULL,
  `MobilePIN` VARCHAR(16) CHARACTER SET 'utf8mb4' NULL,
  `Email` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `LoweredEmail` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `PasswordQuestion` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `PasswordAnswer` VARCHAR(128) CHARACTER SET 'utf8mb4' NULL,
  `IsApproved` TINYINT(1) NOT NULL,
  `IsLockedOut` TINYINT(1) NOT NULL,
  `CreateDate` DATETIME(6) NOT NULL,
  `LastLoginDate` DATETIME(6) NOT NULL,
  `LastPasswordChangedDate` DATETIME(6) NOT NULL,
  `LastLockoutDate` DATETIME(6) NOT NULL,
  `FailedPasswordAttemptCount` INT NOT NULL,
  `FailedPasswordAttemptWindowStart` DATETIME(6) NOT NULL,
  `FailedPasswordAnswerAttemptCount` INT NOT NULL,
  `FailedPasswordAnswerAttemptWindowStart` DATETIME(6) NOT NULL,
  `Comment` LONGTEXT NULL,
  PRIMARY KEY (`UserId`),
  CONSTRAINT `FK_aspnet_Membership_ApplicationId_aspnet_Applications_Applica1`
    FOREIGN KEY (`ApplicationId`)
    REFERENCES `YixunCcmz`.`aspnet_Applications` (`ApplicationId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_aspnet_Membership_UserId_aspnet_Users_UserId`
    FOREIGN KEY (`UserId`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_Profile
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_Profile` (
  `UserId` VARCHAR(64)  NOT NULL,
  `PropertyNames` LONGTEXT NOT NULL,
  `PropertyValuesString` LONGTEXT NOT NULL,
  `PropertyValuesBinary` LONGBLOB NOT NULL,
  `LastUpdatedDate` DATETIME(6) NOT NULL,
  PRIMARY KEY (`UserId`),
  CONSTRAINT `FK_aspnet_Profile_UserId_aspnet_Users_UserId`
    FOREIGN KEY (`UserId`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_UsersInRoles
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_UsersInRoles` (
  `UserId` VARCHAR(64)  NOT NULL,
  `RoleId` VARCHAR(64)  NOT NULL,
  PRIMARY KEY (`UserId`, `RoleId`),
  CONSTRAINT `FK_aspnet_UsersInRoles_RoleId_aspnet_Roles_RoleId`
    FOREIGN KEY (`RoleId`)
    REFERENCES `YixunCcmz`.`aspnet_Roles` (`RoleId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_aspnet_UsersInRoles_UserId_aspnet_Users_UserId`
    FOREIGN KEY (`UserId`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Bn_TreatmentReimburse
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Bn_TreatmentReimburse` (
  `ID` VARCHAR(64)  NOT NULL,
  `Pay_Type` INT NOT NULL,
  `Apply_Hospital_ID` VARCHAR(64)  NULL,
  `Reim_NO` VARCHAR(50) NULL,
  `Sfzh` VARCHAR(20) NULL,
  `Medicare_State` INT NULL,
  `Person_Code` VARCHAR(100) NULL,
  `Reim_Source` INT NOT NULL,
  `BillNO` VARCHAR(500) NULL,
  `TreatmentHosptial_Code` VARCHAR(100) NULL,
  `TreatmentHosptial` VARCHAR(100) NOT NULL,
  `Treatment_NO` VARCHAR(100) NULL,
  `Reim_Type_ID` INT NOT NULL,
  `In_Date` DATETIME(6) NULL,
  `Out_Date` DATETIME(6) NULL,
  `Medicare_Date` DATETIME(6) NULL,
  `TypeIn_Date` DATETIME(6) NULL,
  `Medicare_Line` DECIMAL(19,4) NOT NULL,
  `StdDisease_Code` VARCHAR(50) NULL,
  `StdDisease_Name` VARCHAR(100) NULL,
  `AMoney` DECIMAL(19,4) NULL,
  `BMoney` DECIMAL(19,4) NULL,
  `CMoney` DECIMAL(19,4) NULL,
  `ZL_Money` DECIMAL(19,4) NOT NULL,
  `ZF_Money` DECIMAL(19,4) NOT NULL,
  `YLZ_Money` DECIMAL(19,4) NOT NULL,
  `GR_Money` DECIMAL(19,4) NOT NULL,
  `YBBX_Money` DECIMAL(19,4) NOT NULL,
  `XNH_Money` DECIMAL(19,4) NOT NULL,
  `Family_Code` VARCHAR(50) NULL,
  `Apply_Date` DATETIME(6) NULL,
  `DBBX_Money` DECIMAL(19,4) NOT NULL,
  `Card_NO` VARCHAR(50) NULL,
  `Finish_Flag` INT NOT NULL DEFAULT 0,
  `SfLb` VARCHAR(50) NOT NULL,
  `JGBM` VARCHAR(100) NULL,
  `PrintCount` INT NULL,
  `Operator_ID` VARCHAR(64)  NOT NULL,
  `Create_Time` DATETIME(6) NULL,
  `Pay_Operator_ID` VARCHAR(64)  NULL,
  `Finish_Date` DATETIME(6) NULL,
  `SelfBaseMoney` DECIMAL(19,4) NOT NULL,
  `YLJZ_Money` DECIMAL(19,4) NOT NULL,
  `Cancel_Date` DATETIME(6) NULL,
  `Cancel_Operator_ID` VARCHAR(64)  NULL,
  `Memo` VARCHAR(2000) NULL,
  `YB_Info` VARCHAR(2000) NULL,
  `YBHG_Money` DECIMAL(19,4) NULL,
  `SelfBaseMoney_Total` DECIMAL(19,4) NULL,
  `YLJZ_Money_Total` DECIMAL(19,4) NULL,
  `Spec_BN` INT NOT NULL,
  `CYDBBC_Money` DECIMAL(19,4) NOT NULL,
  `IdentityType_ID` INT NULL,
  `SelBaseMoney_ZY_Total` DECIMAL(19,4) NULL,
  `GR_Accout_Pay` DECIMAL(19,4) NULL,
  `YB_Other_Pay` DECIMAL(19,4) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_BN_TREAT_REFERENCE_ASP1`
    FOREIGN KEY (`Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_TREAT_REFERENCE_ASP2`
    FOREIGN KEY (`Pay_Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_TREAT_REFERENCE_DICT_FAM`
    FOREIGN KEY (`Sfzh`)
    REFERENCES `YixunCcmz`.`Dict_FamilyMember1` (`Sfzh`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_TREAT_REFERENCE_DICT_HOS`
    FOREIGN KEY (`Apply_Hospital_ID`)
    REFERENCES `YixunCcmz`.`Dict_Hospital` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_TREAT_REFERENCE_DICT_IDE`
    FOREIGN KEY (`IdentityType_ID`)
    REFERENCES `YixunCcmz`.`Dict_IdentityType` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_TREAT_REFERENCE_DICT_REI`
    FOREIGN KEY (`Reim_Type_ID`)
    REFERENCES `YixunCcmz`.`Dict_ReimburseType` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_TREAT_REFERENCE_DICT_STD`
    FOREIGN KEY (`StdDisease_Code`)
    REFERENCES `YixunCcmz`.`Dict_StdDisease` (`Code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Bn_TreatmentReimburse_aspnet_Users`
    FOREIGN KEY (`Cancel_Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Bn_TreatmentReimburse_Dict_GovermentDept`
    FOREIGN KEY (`JGBM`)
    REFERENCES `YixunCcmz`.`Dict_GovermentDept` (`FullCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Bn_ECJZ
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Bn_ECJZ` (
  `ID` VARCHAR(64)  NOT NULL,
  `JGBM_Qu` VARCHAR(100) NOT NULL,
  `Reim_NO` VARCHAR(50) NULL,
  `JGBM` VARCHAR(100) NOT NULL,
  `Hospital_ID` VARCHAR(64)  NOT NULL,
  `Sfzh` VARCHAR(20) NOT NULL,
  `TypeIn_Date` DATETIME(6) NOT NULL,
  `IdentityType_ID` INT NOT NULL,
  `BeginDate` DATETIME(6) NOT NULL,
  `EndDate` DATETIME(6) NOT NULL,
  `SumYLJZ_Money` DECIMAL(19,4) NOT NULL,
  `SumZiFu_Money` DECIMAL(19,4) NOT NULL,
  `Finish_Flag` INT NOT NULL DEFAULT 0,
  `YLJZ_Money` DECIMAL(19,4) NOT NULL,
  `Operator_ID` VARCHAR(64)  NOT NULL,
  `Create_Time` DATETIME(6) NULL,
  `Approve_Date` DATETIME(6) NULL,
  `Approve_Operator_ID` VARCHAR(64)  NULL,
  `Pay_Operator_ID` VARCHAR(64)  NULL,
  `Finish_Date` DATETIME(6) NULL,
  `Cancel_Date` DATETIME(6) NULL,
  `Cancel_Operator_ID` VARCHAR(64)  NULL,
  `PrintCount` INT NULL,
  `Memo` VARCHAR(2000) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_BN_ECJZ_ASPNET_1`
    FOREIGN KEY (`Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_ASPNET_2`
    FOREIGN KEY (`Approve_Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_ASPNET_3`
    FOREIGN KEY (`Pay_Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_ASPNET_4`
    FOREIGN KEY (`Cancel_Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_DICT_GOV_Qu`
    FOREIGN KEY (`JGBM_Qu`)
    REFERENCES `YixunCcmz`.`Dict_GovermentDept` (`FullCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_REFERENCE_DICT_FAM`
    FOREIGN KEY (`Sfzh`)
    REFERENCES `YixunCcmz`.`Dict_FamilyMember1` (`Sfzh`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_REFERENCE_DICT_GOV`
    FOREIGN KEY (`JGBM`)
    REFERENCES `YixunCcmz`.`Dict_GovermentDept` (`FullCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_REFERENCE_DICT_HOS`
    FOREIGN KEY (`Hospital_ID`)
    REFERENCES `YixunCcmz`.`Dict_Hospital` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_ECJZ_REFERENCE_DICT_IDE`
    FOREIGN KEY (`IdentityType_ID`)
    REFERENCES `YixunCcmz`.`Dict_IdentityType` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Bn_DEJZ
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Bn_DEJZ` (
  `ID` VARCHAR(64)  NOT NULL,
  `Reim_NO` VARCHAR(50) NULL,
  `Disease_ID` VARCHAR(64)  NOT NULL,
  `JGBM` VARCHAR(100) NOT NULL,
  `Hospital_ID` VARCHAR(64)  NOT NULL,
  `Sfzh` VARCHAR(20) NOT NULL,
  `TypeIn_Date` DATETIME(6) NOT NULL,
  `IdentityType_ID` INT NOT NULL,
  `Create_Time` DATETIME(6) NULL,
  `Operator_ID` VARCHAR(64)  NOT NULL,
  `Finish_Date` DATETIME(6) NULL,
  `Finish_Flag` INT NOT NULL DEFAULT 0,
  `YLJZ_Money` DECIMAL(19,4) NOT NULL,
  `Pay_Operator_ID` VARCHAR(64)  NULL,
  `Cancel_Date` DATETIME(6) NULL,
  `Cancel_Operator_ID` VARCHAR(64)  NULL,
  `PrintCount` INT NULL,
  `Memo` VARCHAR(2000) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_BN_DEJZ_REFERENCE__UA2`
    FOREIGN KEY (`Pay_Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_DEJZ_REFERENCE_DICT_DIS`
    FOREIGN KEY (`Disease_ID`)
    REFERENCES `YixunCcmz`.`Dict_Disease` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_DEJZ_REFERENCE_DICT_FAM`
    FOREIGN KEY (`Sfzh`)
    REFERENCES `YixunCcmz`.`Dict_FamilyMember1` (`Sfzh`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_DEJZ_REFERENCE_DICT_GOV`
    FOREIGN KEY (`JGBM`)
    REFERENCES `YixunCcmz`.`Dict_GovermentDept` (`FullCode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_DEJZ_REFERENCE_DICT_HOS`
    FOREIGN KEY (`Hospital_ID`)
    REFERENCES `YixunCcmz`.`Dict_Hospital` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_DEJZ_REFERENCE_DICT_IDE`
    FOREIGN KEY (`IdentityType_ID`)
    REFERENCES `YixunCcmz`.`Dict_IdentityType` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_DEJZ_REFERENCE_UA1`
    FOREIGN KEY (`Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_BN_DEJZ_REFERENCE_UA3`
    FOREIGN KEY (`Cancel_Operator_ID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_FamilyMember1_Quota
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_FamilyMember1_Quota` (
  `ID` VARCHAR(64)  NOT NULL,
  `Sfzh` VARCHAR(20) NULL,
  `OperID` VARCHAR(64)  NOT NULL,
  `BeginTime` DATETIME(6) NOT NULL,
  `EndTime` DATETIME(6) NOT NULL,
  `OldQuota` DECIMAL(19,4) NOT NULL,
  `NewQuota` DECIMAL(19,4) NOT NULL,
  `CreateTime` DATETIME(6) NOT NULL,
  `Memo` LONGTEXT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_DICT_FAM_REFERENCE_D_FAM2`
    FOREIGN KEY (`Sfzh`)
    REFERENCES `YixunCcmz`.`Dict_FamilyMember1` (`Sfzh`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_DICT_FAM_REFERENCE_T_U2`
    FOREIGN KEY (`OperID`)
    REFERENCES `YixunCcmz`.`aspnet_Users` (`UserId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Bn_TreatmentReimburse_PayDetail
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Bn_TreatmentReimburse_PayDetail` (
  `ID` VARCHAR(64)  NOT NULL,
  `TR_ID` VARCHAR(64)  NOT NULL,
  `FromMoney` DECIMAL(19,4) NULL,
  `ToMoney` DECIMAL(19,4) NULL,
  `PayPercent` DECIMAL(5,2) NULL,
  `PayBaseMoney` DECIMAL(19,4) NULL,
  `PayMoney` DECIMAL(19,4) NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_BN_TREAT_REFERENCE_BN_TREAT`
    FOREIGN KEY (`TR_ID`)
    REFERENCES `YixunCcmz`.`Bn_TreatmentReimburse` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.Dict_Function
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`Dict_Function` (
  `PermissionId` VARCHAR(64)   CHARACTER SET 'utf8mb4' NOT NULL,
  `PermissionName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `PermissionDisplayName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `FunType` INT NOT NULL,
  `ParentPermissionId` VARCHAR(64)  CHARACTER SET 'utf8mb4' NULL,
  `Seq` VARCHAR(50) CHARACTER SET 'utf8mb4' NOT NULL,
  `Page` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `CssClass` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  PRIMARY KEY (`PermissionId`));
    
    
    ALTER TABLE `YixunCcmz`.`Dict_Function` ADD  FOREIGN KEY (`ParentPermissionId`)
    REFERENCES `YixunCcmz`.`Dict_Function` (`PermissionId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;

-- ----------------------------------------------------------------------------
-- Table YixunCcmz.aspnet_WebEvent_Events
-- ----------------------------------------------------------------------------
CREATE TABLE IF NOT EXISTS `YixunCcmz`.`aspnet_WebEvent_Events` (
  `EventId` CHAR(32) NOT NULL,
  `EventTimeUtc` DATETIME(6) NOT NULL,
  `EventTime` DATETIME(6) NOT NULL,
  `EventType` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `EventSequence` BIGINT NOT NULL,
  `EventOccurrence` BIGINT NOT NULL,
  `EventCode` INT NOT NULL,
  `EventDetailCode` INT NOT NULL,
  `Message` VARCHAR(1024) CHARACTER SET 'utf8mb4' NULL,
  `ApplicationPath` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `ApplicationVirtualPath` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `MachineName` VARCHAR(256) CHARACTER SET 'utf8mb4' NOT NULL,
  `RequestUrl` VARCHAR(1024) CHARACTER SET 'utf8mb4' NULL,
  `ExceptionType` VARCHAR(256) CHARACTER SET 'utf8mb4' NULL,
  `Details` LONGTEXT NULL,
  PRIMARY KEY (`EventId`));
SET FOREIGN_KEY_CHECKS = 1;
