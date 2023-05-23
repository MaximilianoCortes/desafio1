FROM node:18.12-alpine

WORKDIR /

COPY . .

EXPOSE 8081

RUN npm install -g @vue/cli-service 

RUN npm i vue@3.2.26

RUN npm install -g

CMD ["npm","run","serve"]