create table matrixService_Matrix (
	matrixId LONG not null primary key,
	matrixName VARCHAR(75) null,
	positionX INTEGER,
	positionY INTEGER,
	dataType VARCHAR(75) null,
	dataValue VARCHAR(75) null
);