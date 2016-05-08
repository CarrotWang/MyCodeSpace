%����2����ά��̬����
MU1    = [1 2];
SIGMA1 = [1 0; 0 0.5];
MU2    = [-1 -1];
SIGMA2 = [1 0; 0 1];
X      = [mvnrnd(MU1, SIGMA1, 1000);mvnrnd(MU2, SIGMA2, 1000)];

%��ʾ
scatter(X(:,1),X(:,2),10,'.');

%GMMs ѧϰ,���Լ���ƴ���, �������Matlab�Դ���ѧϰ����
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
options = statset('Display','final');
obj = gmdistribution.fit(X,2,'Options',options);
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

%��ʾѧϰ��ģ��
figure,h = ezmesh(@(x,y)pdf(obj,[x,y]),[-8 6], [-8 6]);

%��ʾѧϰ����
mu = obj.mu
sigma = obj.Sigma

